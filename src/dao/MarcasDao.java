package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ModeloMarcas;

public class MarcasDao implements DaoGenerica<ModeloMarcas> {

    private ConexaoBanco conexao;

    public MarcasDao(){
        this.conexao = new ConexaoBanco();
    }
    
    @Override
    public void inserir(ModeloMarcas marca){
        String sql = "INSERT INTO marcas (nomeMarca) VALUES (?)";
        try{
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, marca.getNomeMarca());
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void alterar(ModeloMarcas marca) {
        String sql = "UPDATE marcas SET nomeMarca = ? WHERE idMarca = ?";
        try{
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, marca.getNomeMarca());
                sentenca.setInt(2, marca.getIdMarca());
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
        String sql = "DELETE FROM marcas WHERE idMarca = ?";

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
    public ArrayList<ModeloMarcas> consultar() {
        ArrayList<ModeloMarcas> lista = new ArrayList<ModeloMarcas>();
        String sql = "SELECT * FROM marcas ORDER BY nomeMarca";
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while (resultadoSentenca.next()) {
                    ModeloMarcas marca = new ModeloMarcas();
                    marca.setIdMarca(resultadoSentenca.getInt("idMarca"));
                    marca.setNomeMarca(resultadoSentenca.getString("nomeMarca"));
                    lista.add(marca);
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
