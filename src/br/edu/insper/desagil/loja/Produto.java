package br.edu.insper.desagil.loja;

public class Produto {
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}

}
