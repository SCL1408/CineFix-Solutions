package modelo;

import java.util.ArrayList;

public class ModeloDashboard {

    int countProjetores;
    int countCinemas;
    int[] countStatus;

    public ModeloDashboard() {

    }

    public ModeloDashboard(int countProjetores, int countCinemas, int[] countStatus) {
        this.countProjetores = countProjetores;
        this.countCinemas = countCinemas;
        this.countStatus = countStatus;
    }

    public int getCountProjetores() {
        return countProjetores;
    }

    public void setCountProjetores(int countProjetores) {
        this.countProjetores = countProjetores;
    }

    public int getCountCinemas() {
        return countCinemas;
    }

    public void setCountCinemas(int countCinemas) {
        this.countCinemas = countCinemas;
    }
    
    public int[] getCountStatus(){
        return countStatus;
    }
    
    public void setCountStatus(int[] countStatus){
        this.countStatus = countStatus;
    }
}
