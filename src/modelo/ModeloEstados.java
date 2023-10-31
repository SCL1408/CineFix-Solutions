package modelo;


public class ModeloEstados {
    int idEstado;
    String nomeEstado;
    String siglaEstado;
    
    public ModeloEstados() {
       
    }

    public ModeloEstados(int idEstado, String nomeEstado, String siglaEstado){
        this.idEstado = idEstado;
        this.nomeEstado = nomeEstado;
        this.siglaEstado = siglaEstado;
    }
    
    public int getIdEstado(){
        return idEstado;
    }
    public void setIdEstado(int idEstado){
        this.idEstado = idEstado;
    }
    public String getNomeEstado(){
        return nomeEstado;
    }
    public void setNomeEstado(String nomeEstado){
        this.nomeEstado = nomeEstado;
    }
    public String getSiglaEstado(){
        return siglaEstado;
    }
    public void setSiglaEstado(String siglaEstado){
        this.siglaEstado = siglaEstado;
    }
}