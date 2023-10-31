package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ModeloTipos;

public class TiposDao implements DaoGenerica<ModeloTipos> {

    private ConexaoBanco conexao;

    public TiposDao(){
        this.conexao = new ConexaoBanco();
    }
    
    @Override
    public void inserir(ModeloTipos tipo){
        String sql = "INSERT INTO tiposProjetores (nomeTipo) VALUES (?)";
        try{
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, tipo.getNomeTipo());
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void alterar(ModeloTipos tipo) {
        String sql = "UPDATE tiposProjetores SET nomeTipo = ? WHERE idTipo = ?";
        try{
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, tipo.getNomeTipo());
                sentenca.setInt(2, tipo.getIdTipo());
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void excluir(int id) {
        String sql = "DELETE FROM tiposProjetores WHERE idTipo = ?";

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
    public ArrayList<ModeloTipos> consultar() {
        ArrayList<ModeloTipos> lista = new ArrayList<ModeloTipos>();
        String sql = "SELECT * FROM tiposProjetores ORDER BY nomeTipo";
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while (resultadoSentenca.next()) {
                    ModeloTipos tipo = new ModeloTipos();
                    tipo.setIdTipo(resultadoSentenca.getInt("idTipo"));
                    tipo.setNomeTipo(resultadoSentenca.getString("nomeTipo"));
                    lista.add(tipo);
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
