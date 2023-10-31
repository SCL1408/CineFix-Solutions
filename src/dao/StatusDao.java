package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ModeloStatus;

public class StatusDao{

    private ConexaoBanco conexao;

    public StatusDao(){
        this.conexao = new ConexaoBanco();
    }
    
    public ArrayList<ModeloStatus> consultar() {
        ArrayList<ModeloStatus> lista = new ArrayList<ModeloStatus>();
        String sql = "SELECT * FROM status ORDER BY nomeStatus";
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while (resultadoSentenca.next()) {
                    ModeloStatus status = new ModeloStatus();
                    status.setIdStatus(resultadoSentenca.getInt("idStatus"));
                    status.setNomeStatus(resultadoSentenca.getString("nomeStatus"));
                    status.setDescricaoStatus(resultadoSentenca.getString("descricaoStatus"));
                    lista.add(status);
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
