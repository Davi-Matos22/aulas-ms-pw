package br.edu.cpti.teste;

import java.time.LocalDate;

import br.edu.cpti.model.Produto;

public class TesteProduto {
	public static void main(String[] args) {
		//instanciação
		Produto produto1 = new Produto();
		
		//Inserindo valores
		produto1.setCodigo(1);
		produto1.setDescricao("Iphone");
		produto1.setDataCadastro(LocalDate.now());
		produto1.setValor(122.);
		
		
		//Exibindo os valores
		System.out.println("1° produto");
		System.out.println(produto1.getCodigo());
		System.out.println(produto1.getDescricao());
		
		
		System.out.println("\n");
		
		//---------------------------------------------------------------------------------------
		
		
		//instaciação com construtor
		System.out.println("2° produto");
		Produto produto2 = new Produto(22,"Apple Watch",123.23,LocalDate.now());
		
		System.out.println(produto2.getDescricao());
		System.out.println(produto2.getDataCadastro());
		
	}
	
}
