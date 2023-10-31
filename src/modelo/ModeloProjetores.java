package modelo;

import java.util.Date;
import java.sql.Timestamp;

public class ModeloProjetores {

    int idProjetor;
    String numSerie;
    int idModelo;
    String nomeModelo;
    int idMarca;
    String nomeMarca;
    int idCinema;
    String nomeCinema;
    int idStatus;
    String nomeStatus;
    Date dataFabricacao;
    Timestamp dataInstalacao;

    public ModeloProjetores() {

    }

    public ModeloProjetores(int idProjetor, String numSerie, int idModelo, String nomeModelo, 
            int idMarca, String nomeMarca, int idCinema, String nomeCinema, int idStatus, 
            String nomeStatus, Date dataFabricacao, Timestamp dataInstalacao) {
        this.idProjetor = idProjetor;
        this.numSerie = numSerie;
        this.idModelo = idModelo;
        this.nomeModelo = nomeModelo;
        this.idMarca = idMarca;
        this.nomeMarca = nomeMarca;
        this.idProjetor = idCinema;
        this.nomeCinema = nomeCinema;
        this.idStatus = idStatus;
        this.nomeStatus = nomeStatus;
        this.dataFabricacao = dataFabricacao;
        this.dataInstalacao = dataInstalacao;
    }

    public int getIdProjetor() {
        return idProjetor;
    }

    public void setIdProjetor(int idProjetor) {
        this.idProjetor = idProjetor;
    }
    
    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
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

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }
    
    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }
    
    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }
    
    public String getNomeStatus() {
        return nomeStatus;
    }

    public void setNomeStatus(String nomeStatus) {
        this.nomeStatus = nomeStatus;
    }
    
    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    public Timestamp getDataInstalacao() {
        return dataInstalacao;
    }

    public void setDataInstalacao(Timestamp dataInstalacao) {
        this.dataInstalacao = dataInstalacao;
    }
}
