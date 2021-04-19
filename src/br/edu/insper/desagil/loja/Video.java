package br.edu.insper.desagil.loja;

import java.util.Map;

public class Video {
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<Usuario,Integer> avaliacoes;
	
	
	
	public Video(int id, Usuario usuario, Produto produto, Map<Usuario, Integer> avaliacoes) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = avaliacoes;
	}
	public void AdicionaAvaliacao(Usuario usuario, int inteiro) {
		if (usuario != this.usuario) {
			if (inteiro>= 1 && inteiro <= 5) {
				avaliacoes.put(usuario, inteiro);
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
