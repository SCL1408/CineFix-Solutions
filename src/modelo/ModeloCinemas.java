package modelo;

public class ModeloCinemas {

    int idCinema;
    String nomeCinema;
    int idEndereco;

    public ModeloCinemas() {

    }

    public ModeloCinemas(int idCinema, String nomeCinema, int idEndereco) {
        this.idCinema = idCinema;
        this.nomeCinema = nomeCinema;
        this.idEndereco = idEndereco;
    }

    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    public String getNomeCinema() {
        return nomeCinema;
    }

    public void setNomeCinema(String nomeCinema) {
        this.nomeCinema = nomeCinema;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }
}
