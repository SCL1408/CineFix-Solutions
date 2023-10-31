    package modelo;

    public class ModeloEnderecos {
        int idEndereco;
        String logradouro;
        int numero;
        String complemento;
        String bairro;
        String cidade;
        int idEstado;
        String nomeEstado;
        String cep;

        public ModeloEnderecos() {

        }

        public ModeloEnderecos(int idEndereco, String logradouro, int numero, String complemento, String bairro, String cidade, int idEstado, String nomeEstado, String cep){
            this.idEndereco = idEndereco;
            this.logradouro = logradouro;
            this.numero = numero;
            this.complemento = complemento;
            this.bairro = bairro;
            this.cidade = cidade;
            this.idEstado = idEstado;
            this.nomeEstado = nomeEstado;
            this.cep=cep;
        }

        public int getIdEndereco(){
            return idEndereco;
        }
        public void setIdEndereco(int idEndereco){
            this.idEndereco = idEndereco;
        }
        public String getLogradouro(){
            return logradouro;
        }
        public void setLogradouro(String logradouro){
            this.logradouro = logradouro;
        }
        public int getNumero(){
            return numero;
        }
        public void setNumero(int numero){
            this.numero = numero;
        }
        public String getComplemento(){
            return complemento;
        }
        public void setComplemento(String complemento){
            this.complemento = complemento;
        }
        public String getBairro(){
            return bairro;
        }
        public void setBairro(String bairro){
            this.bairro = bairro;
        }
        public String getCidade(){
            return cidade;
        }
        public void setCidade(String cidade){
            this.cidade = cidade;
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
        public String getCEP(){
            return cep;
        }
        public void setCEP(String cep){
            this.cep = cep;
        }
    }
