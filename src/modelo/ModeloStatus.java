package modelo;


public class ModeloStatus {
    int idStatus;
    String nomeStatus;
    String descricaoStatus;
    
    public ModeloStatus() {
       
    }

    public ModeloStatus(int idStatus, String nomeStatus, String descricaoStatus){
        this.idStatus = idStatus;
        this.nomeStatus = nomeStatus;
        this.descricaoStatus = descricaoStatus;
    }
    
    public int getIdStatus(){
        return idStatus;
    }
    public void setIdStatus(int idStatus){
        this.idStatus = idStatus;
    }
    public String getNomeStatus(){
        return nomeStatus;
    }
    public void setNomeStatus(String nomeStatus){
        this.nomeStatus = nomeStatus;
    }
    public String getDescricaoStatus(){
        return descricaoStatus;
    }
    public void setDescricaoStatus(String descricaoStatus){
        this.descricaoStatus = descricaoStatus;
    }
}