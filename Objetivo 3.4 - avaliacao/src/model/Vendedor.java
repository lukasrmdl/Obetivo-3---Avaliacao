package model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Funcionario {

    private String local;

    private List<Pedido> pedidos = new ArrayList<>();

    public Vendedor() {
        super();
    }

    public Vendedor(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local ) {
        super();
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.local = local;
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "\nVendedor [matricula=" + matricula + ", nome=" + nome + ", endereço=" + endereco + ", bairro=" + bairro
                + ", CEP =" + cep + ", Cidade =" + cidade + ", Estado =" + estado +  ", Local =" + local +  "]";
    }
}
