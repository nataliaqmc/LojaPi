package br.edu.insper.desagil.loja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	private Usuario u;
	private Produto p;
	@BeforeEach
	public void setUp() {
		u = new Usuario("User");
		p = new Produto("Simpsons", 42.00);
	}
	
	@Test
	public void teste1() {
		Video video = u.postaVideo(1, p);
		video.adicionaAvaliacao(u, 4);
		video.adicionaAvaliacao(new Usuario("nana"), 0);
		video.adicionaAvaliacao(new Usuario("caca"), 6);
		assertEquals(0,u.totalAvaliacoes());	
	}
	
	@Test
	public void teste2() {
		Video video = u.postaVideo(1, p);
		video.adicionaAvaliacao(new Usuario("nana"), 2);
		assertEquals(2,u.totalAvaliacoes());	
	}
	
	@Test
	public void teste3() {
		Video video = u.postaVideo(1, p);
		video.adicionaAvaliacao(new Usuario("nana"), 4);
		video.adicionaAvaliacao(new Usuario("caca"), 5);
		assertEquals(5,u.totalAvaliacoes());	
	}
	
	@Test
	public void teste4() {
		Video video = u.postaVideo(1, p);
		video.adicionaAvaliacao(new Usuario("nana"), 1);
		video.adicionaAvaliacao(new Usuario("caca"), 3);
		video.adicionaAvaliacao(new Usuario("tata"), 3);
		assertEquals(2,u.totalAvaliacoes());	
	}
	
	@Test
	public void teste5() {
		Video video = u.postaVideo(1, p);
		Video video2 = u.postaVideo(2, p);
		
		video.adicionaAvaliacao(new Usuario("nana"), 1);
		video.adicionaAvaliacao(new Usuario("caca"), 4);
		video2.adicionaAvaliacao(new Usuario("tata"), 3);
		
		assertEquals(6,u.totalAvaliacoes());	
	}
	
	

}
