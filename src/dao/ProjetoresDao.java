package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.zone;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import modelo.ModeloProjetores;

public class ProjetoresDao implements DaoGenerica<ModeloProjetores> {

    private ConexaoBanco conexao;

    public ProjetoresDao() {
        this.conexao = new ConexaoBanco();
    }
   
    @Override
    public void inserir(ModeloProjetores projetor) {
        String sql = "INSERT INTO projetores (numSerie, idModelo, idCinema, idStatus, dataFabricacao) "
                + "VALUES ( "
                + "?, "
                + "(SELECT idModelo FROM modelos WHERE ?=nomeModelo), "
                + "(SELECT idCinema FROM cinemas WHERE ?=nomeCinema), "
                + "(SELECT idStatus FROM status WHERE ?=nomeStatus), "
                + "?)";

        try{
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, projetor.getNumSerie());     
                sentenca.setString(2, projetor.getNomeModelo());     
                sentenca.setString(3, projetor.getNomeCinema());     
                sentenca.setString(4, projetor.getNomeStatus());     
                sentenca.setDate(5, (Date) projetor.getDataFabricacao());
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void alterar(ModeloProjetores projetor) {
        String sql = "UPDATE projetores SET numSerie = ?, dataFabricacao = ?, dataInstalacao = ?, "
                + "idModelo = (SELECT idModelo FROM modelos WHERE nomeModelo=?), "
                + "idCinema = (SELECT idCinema FROM cinemas WHERE nomeCinema=?), "
                + "idStatus = (SELECT idStatus FROM status WHERE nomeStatus=?) "
                + "WHERE idProjetor=?";
        try{
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, projetor.getNumSerie());
                sentenca.setDate(2, (Date) projetor.getDataFabricacao());
                sentenca.setTimestamp(3, projetor.getDataInstalacao());
                sentenca.setString(4, projetor.getNomeModelo());
                sentenca.setString(5, projetor.getNomeCinema());
                sentenca.setString(6, projetor.getNomeStatus());
                sentenca.setInt(7, projetor.getIdProjetor());
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex){
           throw new RuntimeException(ex);
        }
    }

    @Override
    public void excluir(int id) {
        String sql = "DELETE FROM projetores WHERE idProjetor = ?";

        try{
            if (this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setInt(1, id);
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }catch (SQLException ex){
            throw new RuntimeException(ex);
        }
    }

    @Override
    public ArrayList<ModeloProjetores> consultar() {
        ArrayList<ModeloProjetores> lista = new ArrayList<ModeloProjetores>();
        String sql = "SELECT pr.idProjetor, pr.numSerie, pr.idModelo, pr.idCinema, pr.idStatus, pr.dataFabricacao, pr.dataInstalacao, "
                   + "mo.nomeModelo, mo.idMarca, ma.nomeMarca, ci.nomeCinema, st.nomeStatus "
                   + "FROM projetores as pr "
                   + "INNER JOIN modelos as mo ON mo.idModelo = pr.idModelo "
                   + "INNER JOIN marcas as ma ON mo.idModelo = pr.idModelo AND mo.idMarca = ma.idMarca "
                   + "INNER JOIN cinemas as ci ON ci.idCinema = pr.idCinema "
                   + "INNER JOIN status as st ON st.idStatus = pr.idStatus";
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while (resultadoSentenca.next()) {
                    ModeloProjetores projetor = new ModeloProjetores();
                    projetor.setIdProjetor(resultadoSentenca.getInt("pr.idProjetor"));
                    projetor.setIdModelo(resultadoSentenca.getInt("pr.idModelo"));
                    projetor.setIdCinema(resultadoSentenca.getInt("pr.idCinema"));
                    projetor.setIdStatus(resultadoSentenca.getInt("pr.idStatus"));
                    projetor.setIdMarca(resultadoSentenca.getInt("mo.idMarca"));
                    projetor.setNumSerie(resultadoSentenca.getString("numSerie"));
                    projetor.setNomeModelo(resultadoSentenca.getString("nomeModelo"));
                    projetor.setNomeCinema(resultadoSentenca.getString("nomeCinema"));
                    projetor.setNomeStatus(resultadoSentenca.getString("nomeStatus"));
                    projetor.setNomeMarca(resultadoSentenca.getString("nomeMarca"));
                    projetor.setDataFabricacao(resultadoSentenca.getDate("pr.dataFabricacao"));
                    projetor.setDataInstalacao(resultadoSentenca.getTimestamp("pr.dataInstalacao"));
                    lista.add(projetor);
                }
                sentenca.close();
                this.conexao.getConnection().close();
            }
            return lista;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public String[] consultarTipos(int id){
        ArrayList<String> listaAux = new ArrayList<String>();
        String sql = "SELECT ti.nomeTipo "
                   + "FROM tiposProjetores AS ti "
                   + "INNER JOIN associacaoProjetorTipo AS apt ON apt.idTipo = ti.idTipo "
                   + "WHERE apt.idTipo = ti.idTipo AND apt.idProjetor = ?";
        try{
            if(this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setInt(1, id);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while(resultadoSentenca.next()) {
                    listaAux.add(resultadoSentenca.getString("ti.nomeTipo"));
                }
                sentenca.close();
                this.conexao.getConnection().close();
            }
            String[] listaTipos = new String[listaAux.size()];
            for(int i=0; i<listaAux.size(); i++){
                listaTipos[i]=listaAux.get(i);
            }
            return listaTipos;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public ArrayList<ModeloProjetores> pesquisar(String str) {
        ArrayList<ModeloProjetores> lista = new ArrayList<ModeloProjetores>();
        String sql = "SELECT pr.idProjetor, pr.numSerie, pr.idModelo, pr.idCinema, pr.idStatus, pr.dataFabricacao, pr.dataInstalacao, "
                   + "mo.nomeModelo, mo.idMarca, ma.nomeMarca, ci.nomeCinema, st.nomeStatus "
                   + "FROM projetores as pr "
                   + "LEFT JOIN modelos as mo ON mo.idModelo = pr.idModelo "
                   + "LEFT JOIN marcas as ma ON mo.idModelo = pr.idModelo AND mo.idMarca = ma.idMarca "
                   + "LEFT JOIN cinemas as ci ON ci.idCinema = pr.idCinema "
                   + "LEFT JOIN status as st ON st.idStatus = pr.idStatus "
//                   + "WHERE pr.numSerie LIKE '%777%';";
                   + "WHERE pr.numSerie LIKE ?;";
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, "%"+str+"%");
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while (resultadoSentenca.next()) {
                    ModeloProjetores projetor = new ModeloProjetores();
                    projetor.setIdProjetor(resultadoSentenca.getInt("pr.idProjetor"));
                    projetor.setIdModelo(resultadoSentenca.getInt("pr.idModelo"));
                    projetor.setIdCinema(resultadoSentenca.getInt("pr.idCinema"));
                    projetor.setIdStatus(resultadoSentenca.getInt("pr.idStatus"));
                    projetor.setIdMarca(resultadoSentenca.getInt("mo.idMarca"));
                    projetor.setNumSerie(resultadoSentenca.getString("numSerie"));
                    projetor.setNomeModelo(resultadoSentenca.getString("nomeModelo"));
                    projetor.setNomeCinema(resultadoSentenca.getString("nomeCinema"));
                    projetor.setNomeStatus(resultadoSentenca.getString("nomeStatus"));
                    projetor.setNomeMarca(resultadoSentenca.getString("nomeMarca"));
                    projetor.setDataFabricacao(resultadoSentenca.getDate("pr.dataFabricacao"));
                    projetor.setDataInstalacao(resultadoSentenca.getTimestamp("pr.dataInstalacao"));
                    lista.add(projetor);
                }
                sentenca.close();
                this.conexao.getConnection().close();
            }
            return lista;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
