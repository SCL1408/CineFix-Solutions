package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ModeloModelos;

public class ModelosDao implements DaoGenerica<ModeloModelos> {

    private ConexaoBanco conexao;

    public ModelosDao() {
        this.conexao = new ConexaoBanco();
    }
   
    @Override
    public void inserir(ModeloModelos modelo){
        String sql = "INSERT INTO modelos (nomeModelo, idMarca) VALUES (?, (SELECT idMarca FROM marcas WHERE nomeMarca = ?))";
        try{
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, modelo.getNomeModelo());
                sentenca.setString(2, modelo.getNomeMarca());                
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void alterar(ModeloModelos modelo) {
        String sql = "UPDATE modelos SET nomeModelo = ?, idMarca = (SELECT idMarca FROM marcas WHERE nomeMarca = ?) where idModelo = ?";
        try{
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1,modelo.getNomeModelo());
                sentenca.setString(2, modelo.getNomeMarca());
                sentenca.setInt(3, modelo.getIdModelo());
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
        String sql = "DELETE FROM modelos WHERE idModelo = ?";

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
    public ArrayList<ModeloModelos> consultar() {
        ArrayList<ModeloModelos> lista = new ArrayList<ModeloModelos>();
        String sql = "SELECT mo.idModelo, mo.nomeModelo, ma.nomeMarca FROM modelos as mo INNER JOIN marcas as ma ON mo.Idmarca = ma.Idmarca ORDER BY ma.nomeMarca";
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while (resultadoSentenca.next()) {
                    ModeloModelos modelo = new ModeloModelos();
                    modelo.setIdModelo(resultadoSentenca.getInt("idModelo"));
                    modelo.setNomeModelo(resultadoSentenca.getString("nomeModelo"));
                    modelo.setNomeMarca(resultadoSentenca.getString("nomeMarca"));
                    lista.add(modelo);
                }
                sentenca.close();
                this.conexao.getConnection().close();
            }
            return lista;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public ArrayList<ModeloModelos> consultarPorMarca(String nomeMarca) {
        ArrayList<ModeloModelos> lista = new ArrayList<ModeloModelos>();
        String sql = "SELECT * FROM modelos WHERE idMarca=(SELECT idMarca FROM marcas WHERE nomeMarca=?) ORDER BY nomeModelo";
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, nomeMarca);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while (resultadoSentenca.next()) {
                    ModeloModelos modelo = new ModeloModelos();
                    modelo.setIdModelo(resultadoSentenca.getInt("idModelo"));
                    modelo.setNomeModelo(resultadoSentenca.getString("nomeModelo"));
                    modelo.setIdMarca(resultadoSentenca.getInt("idMarca"));
                    modelo.setNomeMarca(nomeMarca);
                    lista.add(modelo);
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
