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

	private void postaVideo(int id, String produto) {
		Video v = new Video(id, this.nome, produto);
		videos.add(v);
	}
	
	private void totalAvaliacoes() {
		
		
	}

	public String getNome() {
		return this.nome;
	}
	
}
