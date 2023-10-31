package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ModeloEstados;

public class EstadosDao implements DaoGenerica<ModeloEstados> {

    private ConexaoBanco conexao;

    public EstadosDao(){
        this.conexao = new ConexaoBanco();
    }
    
    @Override
    public void inserir(ModeloEstados estado){
        String sql = "INSERT INTO estados (nomeEstado, siglaEstado) VALUES (?, ?)";
        try{
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, estado.getNomeEstado());
                sentenca.setString(2, estado.getSiglaEstado());
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void alterar(ModeloEstados estado) {
        String sql = "UPDATE estados SET nomeEstado = ?, siglaEstado = ? WHERE idEstado = ?";
        try{
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, estado.getNomeEstado());
                sentenca.setString(2, estado.getSiglaEstado());
                sentenca.setInt(3, estado.getIdEstado());
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
        String sql = "DELETE FROM estados WHERE idEstado = ?";

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
    public ArrayList<ModeloEstados> consultar() {
        ArrayList<ModeloEstados> lista = new ArrayList<ModeloEstados>();
        String sql = "SELECT * FROM estados ORDER BY nomeEstado";
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while (resultadoSentenca.next()) {
                    ModeloEstados estado = new ModeloEstados();
                    estado.setIdEstado(resultadoSentenca.getInt("idEstado"));
                    estado.setNomeEstado(resultadoSentenca.getString("nomeEstado"));
                    estado.setSiglaEstado(resultadoSentenca.getString("siglaEstado"));
                    lista.add(estado);
                }
                sentenca.close();
                this.conexao.getConnection().close();
            }
            return lista;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public String consultarEstado(String estado) {
        String sql = "SELECT siglaEstado FROM estados WHERE nomeEstado = ?";
        ModeloEstados model = new ModeloEstados();
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, estado);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                if(resultadoSentenca.next()){
                    model.setSiglaEstado(resultadoSentenca.getString("siglaEstado"));
                }
                sentenca.close();
                this.conexao.getConnection().close();
            }
            return model.getSiglaEstado();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public String consultarSigla(String estado) {
        String sql = "SELECT nomeEstado FROM estados WHERE siglaEstado = ?";
        ModeloEstados model = new ModeloEstados();
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, estado);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                if(resultadoSentenca.next()){
                    model.setSiglaEstado(resultadoSentenca.getString("nomeEstado"));
                }
                sentenca.close();
                this.conexao.getConnection().close();
            }
            return model.getSiglaEstado();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
