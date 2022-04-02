package dio.desafio.banco;

public class Endereco {

    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String estado;
    private String cep;


    public Endereco(String rua, String numero, String complemento, String bairro, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.estado = estado;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return  "Rua: " + rua + ", " + numero + ' ' +
                "(complemento: " + complemento + ")\n" +
                "Bairro: " + bairro + '\n' +
                "Estado: " + estado + '\n' +
                "Cep: " + cep;
    }
}
