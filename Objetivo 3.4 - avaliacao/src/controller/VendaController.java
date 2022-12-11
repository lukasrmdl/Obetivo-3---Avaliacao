package controller;

import model.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class VendaController {
    // venda 1
    public static void main(String[] args) {

        Vendedor jose = new Vendedor(1, "jose samuel", "Helmuth hardt", "Tres vendas", "96070157", "Pelotas", "Rio Grande do Sul", "Calcadao");

        Fornecedor f1 = new Fornecedor("16.785.406/0001-67", "Dirley 5355559292", "Só Alimento S.A.");

        Produto produto1 = new Produto(1, "Cereal", 5, 10.00, f1);

        System.out.println("Venda 1");

        System.out.println("Produtos em estoque : " + produto1.getQuantidade());


        Item iten1 = new Item(1, 0.0, 2, produto1);


        Pedido pedido1 =  new Pedido(
               1,
               new GregorianCalendar(2022, 12, 11, 17, 13),
                20.00,
                iten1
       );

        produto1.setQuantidade(produto1.getQuantidade() - 2);
        System.out.println("Item : " + iten1);
        System.out.println("Pedido : " + pedido1);
        System.out.println("Vendedor : " + jose);
        System.out.println("Produtos em estoque : " + produto1.getQuantidade());

        // venda 2


        Vendedor eduardo = new Vendedor(2, "Eduardo mendes", "arthur felix", "Tres vendas", "96050157", "Pelotas", "Rio Grande do Sul", "Calcadao");

        Fornecedor f2 = new Fornecedor("16.587.406/0001-67", "Josiane 5355559292", "Secos e Molhados S.A.");

        Produto produto2 = new Produto(2, "Leite", 1, 5.00, f2);

        System.out.println("Venda 2");

        System.out.println("Produtos em estoque : " + produto2.getQuantidade());


        Item iten2 = new Item(2, 0.0, 1, produto2);


            Pedido pedido2 =  new Pedido(
                    2,
                    new GregorianCalendar(2022, 12, 11, 17, 39),
                    5.00,
                    iten2
            );
        produto2.setQuantidade(produto2.getQuantidade() - 1);
        System.out.println("Item : " + iten2);
        System.out.println("Pedido : " + pedido2);
        System.out.println("Vendedor : " + eduardo);
        System.out.println("Produtos em estoque : " + produto1.getQuantidade());


        //coleção das Vendas

        List<Pedido> pedidosFeitos = new ArrayList<>();
        pedidosFeitos.add(pedido1);
        pedidosFeitos.add(pedido2);

        System.out.println(pedidosFeitos);
    }
}
