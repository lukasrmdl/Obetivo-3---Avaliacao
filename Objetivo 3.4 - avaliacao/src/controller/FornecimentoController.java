package controller;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

public class FornecimentoController {

	public static void main(String[] args) {
		
		Fornecedor f1 = new Fornecedor("16.785.406/0001-67", "Dirley 5355559292", "Só Alimento S.A.");

		Produto p1 = new Produto(1, "Arroz", 100, 18.90, f1);
		Produto p2 = new Produto(2, "Feijão", 100, 8.90, f1);

		//calcula o total
		double total = (p1.getPreco() * 50) + (p2.getPreco() * 50) ;

		//aumenta o estoque
		p1.setQuantidade(p1.getQuantidade() + 50);
		p2.setQuantidade(p2.getQuantidade() + 50);

		Fornecimento fr1 = new Fornecimento(new GregorianCalendar(2022, 12, 11, 16, 32), total, f1, p1);

		List<Fornecimento> fornecimentos = new ArrayList<>();
		fornecimentos.add(fr1);
		System.out.print("\n***** Lista de Fornecimentos");
		System.out.println(fornecimentos);
		
		double totalEntrada = 0.0;
		for (int i = 0; i < fornecimentos.size(); i++) {
			totalEntrada += fornecimentos.get(i).getTotal();
		}
		System.out.print("\n***** Total de Entrada = " + NumberFormat.getCurrencyInstance().format(totalEntrada));
	}

}
