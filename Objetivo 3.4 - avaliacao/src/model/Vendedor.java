package model;

public class Gerente extends Funcionario {

    private String formacao;

    public Gerente() {
        super();
    }

    public Gerente(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String formacao ) {
        super();
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "\nGerente [matricula=" + matricula + ", nome=" + nome + ", endereço=" + endereco + ", bairro=" + bairro
                + ", CEP =" + cep + ", Cidade =" + cidade + ", Estado =" + estado +  ", Formação =" + formacao +  "]";
    }
}
