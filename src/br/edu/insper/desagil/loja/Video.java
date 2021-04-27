package br.edu.insper.desagil.loja;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<String,Integer> avaliacoes;
	
	
	
	public Video(int id, Usuario usuario, Produto produto) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
	}
	public void adicionaAvaliacao(Usuario usuario, int inteiro) {
		if (usuario.getNome() != this.usuario.getNome()) {
			if (inteiro>= 1 && inteiro <= 5) {
				this.avaliacoes.put(usuario.getNome(), inteiro);
			}
		}
	};
	public int mediaAvaliacoes() {
		double mediaTotal = 0;
		int tamanho = 0;
		for (Integer avaliacao: avaliacoes.values()) {
			mediaTotal += avaliacao;
			tamanho += 1;
		}
		double total = 0.0;
		total = mediaTotal/tamanho;
		int totalmedias;
		totalmedias = (int) Math.round(total);
		return totalmedias;
	}
	public int getId() {
		return this.id;
	}
	public Produto getProduto() {
		return this.produto;
	}
	
	
	
}
