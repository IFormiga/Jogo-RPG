package jogo;

import java.util.Random;

public class Mapa_da_Dungeon {
	private char mapa[][] = new char[10][10];
	
	public Mapa_da_Dungeon(){
		char preenche = ' ';
		int x;
		Random qualquer = new Random();
		for(int i = 0 ; i < 10 ; ++i){
			for(int j = 0 ; j < 10 ; ++j){
				x = qualquer.nextInt(101);
				
				if(x>95 && x<=100){
					preenche = '*';
				}
				if(x>85 && x<=95){
					preenche = '@';
				}
				if(x>65 && x<=85){
					preenche = '#';
				}
				if(x>35 && x<=65){
					preenche = '^';
				}
				if(x>=0 && x<=35){
					preenche = '_';
				}
				if(i == 0 && j == 0){
					this.mapa[0][0] = 'T';
				}
				else if(i == 9 && j == 9){
					this.mapa[9][9] = 'P';
				}
				else{
					this.mapa[i][j] = preenche;
				}
			}
		}
	}
	public void imprimirMapa(){
		for(int i = 0; i < 10 ; ++i){
			for(int j = 0; j < 10 ; ++j){
				System.out.printf("%c ",this.mapa[i][j]); 
			}
		System.out.printf("\n");
		}
	}
	public void setLocalizacao(Personagem player,int i, int j,int i2, int j2){
		int vida = player.getVida();
		
		if(this.mapa[i][j] == '^'){
			player.setVida((vida - 15));
		}
		if(this.mapa[i][j] == '#'){
			player.setVida((vida - 25));
		}
		if(this.mapa[i][j] == '@'){
			player.setVida((vida - 40));
		}
		if(this.mapa[i][j] == '*'){
			player.setVida((vida - 60));
		}
		if(player.getVida()>0){
			this.mapa[i][j] = ' ';
			this.mapa[i2][j2] = 'P';
		}
	}
	public char getPosicao(int i, int j){
		return this.mapa[i][j];
	}
	
	public static void main(String[] args) {
		Mapa_da_Dungeon x = new Mapa_da_Dungeon();
		x.imprimirMapa();
	} 
}
