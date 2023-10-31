package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ModeloCinemas;
import modelo.ModeloEnderecos;

public class EnderecosDao implements DaoGenerica<ModeloEnderecos> {

    private ConexaoBanco conexao;

    public EnderecosDao() {
        this.conexao = new ConexaoBanco();
    }
   
    @Override
    public void inserir(ModeloEnderecos endereco){
        String sql = "INSERT INTO enderecosCinemas (logradouro, numero, complemento, bairro, cidade, idEstado, cep) "
                   + "VALUES (?, ?, ?, ?, ?, (SELECT idEstado FROM estados WHERE nomeEstado = ?), ?)";
        try{
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, endereco.getLogradouro());
                sentenca.setInt(2, endereco.getNumero());
                if(endereco.getComplemento()==null)
                    sentenca.setString(3, null);
                else
                    sentenca.setString(3, endereco.getComplemento()); 
                sentenca.setString(4, endereco.getBairro()); 
                sentenca.setString(5, endereco.getCidade()); 
                sentenca.setString(6, endereco.getNomeEstado());
                sentenca.setString(7, endereco.getCEP());
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void alterar(ModeloEnderecos endereco) {
        String sql = "UPDATE enderecosCinemas "
                   + "SET logradouro = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?, "
                   + "idEstado = (SELECT idEstado FROM estados WHERE nomeEstado = ?), cep=? "
                   + "WHERE idEnderecoCinema = ?";
        try{
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                sentenca.setString(1, endereco.getLogradouro());
                sentenca.setInt(2, endereco.getNumero());
                sentenca.setString(3, endereco.getComplemento());
                sentenca.setString(4, endereco.getBairro()); 
                sentenca.setString(5, endereco.getCidade()); 
                sentenca.setString(6, endereco.getNomeEstado());
                sentenca.setString(7, endereco.getCEP());
                sentenca.setInt(8, endereco.getIdEndereco());
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
        String sql = "DELETE FROM enderecosCinemas WHERE idEnderecoCinema = ?";

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
    public ArrayList<ModeloEnderecos> consultar() {
        ArrayList<ModeloEnderecos> lista = new ArrayList<ModeloEnderecos>();
        String sql = "SELECT en.idEnderecoCinema, en.logradouro, en.numero, en.complemento, en.bairro, en.cidade, es.nomeEstado, en.cep "
                   + "FROM enderecosCinemas as en "
                   + "INNER JOIN estados as es ON en.idEstado = es.idEstado";
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while (resultadoSentenca.next()) {
                    ModeloEnderecos endereco = new ModeloEnderecos();
                    endereco.setIdEndereco(resultadoSentenca.getInt("idEnderecoCinema"));
                    endereco.setLogradouro(resultadoSentenca.getString("logradouro"));
                    endereco.setNumero(resultadoSentenca.getInt("numero"));
                    endereco.setComplemento(resultadoSentenca.getString("complemento"));
                    endereco.setBairro(resultadoSentenca.getString("bairro"));
                    endereco.setCidade(resultadoSentenca.getString("cidade"));
                    endereco.setNomeEstado(resultadoSentenca.getString("nomeEstado"));
                    endereco.setCEP(resultadoSentenca.getString("cep"));
                    lista.add(endereco);
                }
                sentenca.close();
                this.conexao.getConnection().close();
            }
            return lista;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public ModeloEnderecos consultarSelecionado(ModeloEnderecos endereco) {
        String sql = "SELECT idEnderecoCinema, idEstado FROM enderecosCinemas "
                   + "WHERE logradouro = ? AND numero = ? AND complemento = ? AND bairro = ? AND cidade = ?";
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setString(1, endereco.getLogradouro());
                sentenca.setInt(2, endereco.getNumero());
                sentenca.setString(3, endereco.getComplemento()); 
                sentenca.setString(4, endereco.getBairro()); 
                sentenca.setString(5, endereco.getCidade());
                
                ResultSet resultadoSentenca = sentenca.executeQuery();
                if (resultadoSentenca.next()) {
                    endereco.setIdEndereco(resultadoSentenca.getInt("idEnderecoCinema"));
                    endereco.setIdEstado(resultadoSentenca.getInt("idEstado"));
                }
                sentenca.close();
                this.conexao.getConnection().close();
            }
            return endereco;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
