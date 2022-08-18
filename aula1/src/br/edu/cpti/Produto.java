package br.edu.cpti;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;
	
	//A variavel pertence à classe
	private static int totalProdutos;
	
	//construtor
	public Produto() {
		System.out.println("Construtor iniciado !!");
	}
	
	public Produto (int codigo, String descricao, double valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		System.out.println("Contrutor cheio!");
		totalProdutos++;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public static int getTotalProdutos() {
		return totalProdutos;
	}
}
