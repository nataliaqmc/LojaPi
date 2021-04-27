package br.edu.insper.desagil.loja;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video> videos;
	
	public Usuario(String nome) {
		super();
		this.nome = nome;
		this.videos = new ArrayList<>();
	}

	public Video postaVideo(int id, Produto produto) {
		Video v = new Video(id, this, produto);
		this.videos.add(v);
		return v;
	}
	
	public int totalAvaliacoes() {
		int s = 0;
		for (Video video: this.videos) {
			s += video.mediaAvaliacoes();
		}
		return s;
	}

	public String getNome() {
		return this.nome;
	}
	
}
