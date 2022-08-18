package br.edu.cpti;

public class TesteProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		new Produto();
		
		Produto produto3 = new Produto(1,"Maçã",12.45);
		Produto produto4 = new Produto(2,"Limão",45.90);
		Produto produto5 = new Produto(3,"Morango",15.60);
		
		
		produto3.setValor(12.00);
		
		System.out.println(produto3.getCodigo() + " "+ produto3.getDescricao() +" "+ produto3.getValor());
		
		System.out.println(produto4.getCodigo() + " " + produto4.getDescricao() + " " + produto4.getValor());
	
		System.out.println("Total geral de produtos: "+ Produto.getTotalProdutos());
	}
	
}
