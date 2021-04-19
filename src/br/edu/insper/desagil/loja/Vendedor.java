package br.edu.insper.desagil.loja;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario {
	private List<Produto> produtos;
	
	public Vendedor(String nome) {
		super(nome);
		this.produtos = new ArrayList<>();
	}


	public void cadastraProduto(Produto nome, Produto preco) {
		produtos.add(nome);
	}
}
