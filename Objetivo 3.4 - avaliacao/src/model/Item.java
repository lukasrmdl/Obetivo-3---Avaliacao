package model;

public class Item {

    private Integer codItem;
    private Double desconto;
    private Integer quantidade;

    Produto produto;

    public Item() {
        super();
    }

    public Item(Integer codItem, Double desconto, Integer quantidade, Produto produto) {
        super();
        this.codItem = codItem;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }


    @Override
    public String toString() {
        return "\n\nItem [codItem=" + codItem + ", desconto=" + desconto + ", quantidade=" + quantidade + ", produto=" + produto
                + "total: " + this.quantidade * this.produto.getPreco() + "]";
    }

}
