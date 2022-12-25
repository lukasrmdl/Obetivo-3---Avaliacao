package model;

import exception.MyException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Pedido implements Tipo{

    private Integer numero;

    private Calendar data;

    private Double valor;

    private List<Item> itens = new ArrayList<>();

    Vendedor vendedor;



    //construtores

    public Pedido() {

    }
    public Pedido(Integer numero, Calendar data, Double valor, Item item) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.itens.add(item);
    }

    public int getNumero() {
        return numero;
    }

    public Calendar getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }


    public List<Item> getItens() {
        return itens;
    }

    public void setItem(Item item){
        this.itens.add(item);
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }


    public void atualizaEstoque() {
        itens.forEach(item -> {
            try{
                if(item.getQuantidade() <= item.getProduto().getQuantidade()){
                    item.getProduto().setQuantidade(item.getProduto().getQuantidade() - item.getQuantidade());
                }else{
                    throw new MyException("Estoque insuficiente. Produto: " + item.getProduto().getNome());
                }
            }catch (MyException exception){
                exception.printStackTrace();
            }
        });
    }


    @Override
    public String getStatus(String status) {
        return null;
    }

    @Override
    public String toString() {
        return "\n\nPedido [Numero=" + numero + ", Data=" + data + ", Valor=" + valor + ", Itens: " + itens  + "]";
    }
}