package modelo;


public class ModeloMarcas {
    int idMarca;
    String nomeMarca;
    
    public ModeloMarcas() {
       
    }

    public ModeloMarcas(int idMarca, String nomeMarca){
        this.idMarca = idMarca;
        this.nomeMarca = nomeMarca;
    }
    
    public int getIdMarca(){
        return idMarca;
    }
    public void setIdMarca(int idMarca){
        this.idMarca = idMarca;
    }
    public String getNomeMarca(){
        return nomeMarca;
    }
    public void setNomeMarca(String nomeMarca){
        this.nomeMarca = nomeMarca;
    }
}