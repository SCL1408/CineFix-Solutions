package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ModeloCinemas;
import modelo.ModeloDashboard;

public class DashboardDao {

    private ConexaoBanco conexao;

    public DashboardDao() {
        this.conexao = new ConexaoBanco();
    }

    public void retrieve(ModeloDashboard info) {
        int[] countStatus = new int[6];
        String sql = "SELECT " +
                     "(SELECT COUNT(*) FROM projetores) AS numProj, " +
                     "(SELECT COUNT(*) FROM projetores WHERE idStatus=1) AS numProjServico, " +
                     "(SELECT COUNT(*) FROM projetores WHERE idStatus=2) AS numProjDisponivel, " +
                     "(SELECT COUNT(*) FROM projetores WHERE idStatus=3) AS numProjAgurdPeca, " +
                     "(SELECT COUNT(*) FROM projetores WHERE idStatus=4) AS numProjManutencaoAgen, " +
                     "(SELECT COUNT(*) FROM projetores WHERE idStatus=5) AS numProjDescartado, " +
                     "(SELECT COUNT(*) FROM projetores WHERE idStatus=6) AS numProjManutencaoSoli, " +
                     "(SELECT COUNT(*) FROM cinemas) AS numCine;";
        try{
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while(resultadoSentenca.next()) {
                    info.setCountProjetores(resultadoSentenca.getInt("numProj"));
                    info.setCountCinemas(resultadoSentenca.getInt("numCine"));
                    countStatus[0] = resultadoSentenca.getInt("numProjServico");
                    countStatus[1] = resultadoSentenca.getInt("numProjDisponivel");
                    countStatus[2] = resultadoSentenca.getInt("numProjAgurdPeca");
                    countStatus[3] = resultadoSentenca.getInt("numProjManutencaoAgen");
                    countStatus[4] = resultadoSentenca.getInt("numProjDescartado");
                    countStatus[5] = resultadoSentenca.getInt("numProjManutencaoSoli");
                    info.setCountStatus(countStatus);
                }
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
   
    

}
