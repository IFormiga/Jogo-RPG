package jogo;

public class Personagem {
	private String nome;
	private int pocoes;
	private int vida;
	
	public void setName(String nome){
		this.nome = nome;
	}
	public void setPocoes(int pocoes){
		this.pocoes = pocoes;
	}
	public void setVida(int vida){
		this.vida = vida;
	}
	public String getName(){
		return this.nome;
	}
	public int getPocoes(){
		return this.pocoes;
	}
	public int getVida(){
		return this.vida;
	}
}
