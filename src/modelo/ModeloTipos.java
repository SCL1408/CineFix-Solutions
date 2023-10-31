package modelo;


public class ModeloTipos {
    int idTipo;
    String nomeTipo;
    
    public ModeloTipos() {
       
    }

    public ModeloTipos(int idTipo, String nomeTipo){
        this.idTipo = idTipo;
        this.nomeTipo = nomeTipo;
    }
    
    public int getIdTipo(){
        return idTipo;
    }
    public void setIdTipo(int idTipo){
        this.idTipo = idTipo;
    }
    public String getNomeTipo(){
        return nomeTipo;
    }
    public void setNomeTipo(String nomeTipo){
        this.nomeTipo = nomeTipo;
    }
}