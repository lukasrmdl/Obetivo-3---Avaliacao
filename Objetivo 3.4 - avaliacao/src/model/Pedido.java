package model;

import java.util.Calendar;


public class Pedido implements Tipo{

    private Integer numero;

    private Calendar data;

    private Double valor;

    private Item item;

    Vendedor vendedor;



    //construtores

    public Pedido() {

    }
    public Pedido(Integer numero, Calendar data, Double valor, Item item) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.item = item;
    }


    @Override
    public String getStatus(String status) {
        return null;
    }

    @Override
    public String toString() {
        return "\n\nPedido [Numero=" + numero + ", Data=" + data + ", Valor=" + valor + ", total: " + item.getQuantidade() * item.getProduto().getPreco()  + "]";
    }
}