package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ModeloCinemas;

public class CinemasDao implements DaoGenerica<ModeloCinemas> {

    private ConexaoBanco conexao;

    public CinemasDao() {
        this.conexao = new ConexaoBanco();
    }
   
    @Override
    public void inserir(ModeloCinemas cinema){
        String sql = "INSERT INTO cinemas (nomeCinema, idEnderecoCinema) "
                   + "VALUES (?, ?)";
        try{
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, cinema.getNomeCinema());
                sentenca.setInt(2, cinema.getIdEndereco());          
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void alterar(ModeloCinemas cinema) {
        String sql = "UPDATE cinemas SET nomeCinema = ? WHERE idEnderecoCinema=?";
//        String sql = "UPDATE cinemas SET nomeCinema = ? WHERE idCinema=?";
        try{
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, cinema.getNomeCinema());
                sentenca.setInt(2, cinema.getIdEndereco());
                //sentenca.setInt(2, cinema.getIdCinema());
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
        String sql = "DELETE FROM cinemas WHERE idCinema = ?";

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
    public ArrayList<ModeloCinemas> consultar() {
        ArrayList<ModeloCinemas> lista = new ArrayList<ModeloCinemas>();
        String sql = "SELECT idCinema, nomeCinema, idEnderecoCinema FROM cinemas";
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while (resultadoSentenca.next()) {
                    ModeloCinemas cinema = new ModeloCinemas();
                    cinema.setIdCinema(resultadoSentenca.getInt("idCinema"));
                    cinema.setNomeCinema(resultadoSentenca.getString("nomeCinema"));
                    cinema.setIdEndereco(resultadoSentenca.getInt("idEnderecoCinema"));
                    lista.add(cinema);
                }
                sentenca.close();
                this.conexao.getConnection().close();
            }
            return lista;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public ModeloCinemas consultarSelecionado(ModeloCinemas cinema) {
        ModeloCinemas modeloCinema = new ModeloCinemas();
        String sql = "SELECT * FROM cinemas "
                   + "WHERE nomeCinema = ? AND idEnderecoCinema = ?";
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setString(1, cinema.getNomeCinema());
                sentenca.setInt(2, cinema.getIdEndereco());
                
                ResultSet resultadoSentenca = sentenca.executeQuery();
                if (resultadoSentenca.next()) {
                    modeloCinema = cinema;
                    modeloCinema.setIdEndereco(resultadoSentenca.getInt("idCinema"));
                }
                sentenca.close();
                this.conexao.getConnection().close();
            }
            return modeloCinema;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public ModeloCinemas consultarSelecionado(int idEndereco) {
        ModeloCinemas cinema = new ModeloCinemas();
        String sql = "SELECT * FROM cinemas "
                   + "WHERE idEnderecoCinema = ?";
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setInt(1, idEndereco);
                
                ResultSet resultadoSentenca = sentenca.executeQuery();
                if (resultadoSentenca.next()) {
                    cinema.setIdCinema(resultadoSentenca.getInt("idCinema"));
                    cinema.setNomeCinema(resultadoSentenca.getString("nomeCinema"));
                    cinema.setIdEndereco(idEndereco);
                }
                sentenca.close();
                this.conexao.getConnection().close();
            }
            return cinema;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
