    package modelo;

    public class ModeloModelos {
        int idModelo;
        String nomeModelo;
        int idMarca;
        String nomeMarca;

        public ModeloModelos() {

        }

        public ModeloModelos(int idModelo, String nomeModelo,int idMarca, String nomeMarca){
            this.idModelo = idModelo;
            this.nomeModelo = nomeModelo;
            this.idMarca = idMarca;
            this.nomeMarca = nomeMarca;
        }

        public int getIdModelo(){
            return idModelo;
        }
        public void setIdModelo(int idModelo){
            this.idModelo = idModelo;
        }
        public String getNomeModelo(){
            return nomeModelo;
        }
        public void setNomeModelo(String nomeModelo){
            this.nomeModelo = nomeModelo;
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
