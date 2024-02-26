package buscador.modelos;

public class Endereco {
    private String cep;
    private String rua;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String ddd;

    public Endereco(ViaCep viaCep) {
        this.cep = viaCep.cep();
        this.rua = viaCep.logradouro();
        this.complemento = viaCep.complemento();
        this.bairro = viaCep.bairro();
        this.cidade = viaCep.localidade();
        this.estado = viaCep.uf();
        this.ddd = viaCep.ddd();
    }

    @Override
    public String toString() {
        return "(CEP = " + cep +
                ", Rua = " + rua +
                ", Complemento = " + complemento +
                ", Bairro = " + bairro +
                ", Cidade = " + cidade +
                ", Estado = " + estado +
                ", DDD = " + ddd + ')';
    }
}
