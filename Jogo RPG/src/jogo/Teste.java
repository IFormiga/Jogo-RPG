package jogo;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Mapa_da_Dungeon mapa = new Mapa_da_Dungeon();
		Personagem jogador = new Personagem();
		String nome;
		Scanner entrada = new Scanner(System.in);
		String movimento;
		int i = 9;
		int j = 9;
		int i2 = 9;
		int j2 = 9;
		
		System.out.print("Digite o nome do seu player: ");
		nome = entrada.nextLine();
		System.out.printf("\n");
		jogador.setName(nome);
		jogador.setVida(100);
		jogador.setPocoes(3);
		
			do{
				if(i == 9 && j == 9){
					mapa.imprimirMapa();
				}
				System.out.print("Caso escreva errado a pergunta irá se repetir.\n");
				System.out.print("Qual o movimento que deseja fazer? (W - Frente, A - Esquerda, S - Direita, D - Atras)\n") ;
				movimento = entrada.next();
				
				if(movimento.equals("W")||movimento.equals("w")){
					i2 = i-1;
					mapa.setLocalizacao(jogador, i, j, i2, j2);
					i = i2;
				}
				if(movimento.equals("A")||movimento.equals("a")){
					j2 = j-1;
					mapa.setLocalizacao(jogador, i, j, i2, j2);
					j = j2;
				}
				if(movimento.equals("S")||movimento.equals("s")){
					i2 = i+1;
					mapa.setLocalizacao(jogador, i, j, i2, j2);
					i = i2;
				}
				if(movimento.equals("D")||movimento.equals("d")){
					j2 = j+1;
					mapa.setLocalizacao(jogador, i, j, i2, j2);
					j = j2;
				}
				
				if((jogador.getVida()<=0)){
					System.out.printf("É uma pena player, parece que você morreu!!!\n");
				}
				if((mapa.getPosicao(0, 0) == 'P')){
					System.out.printf("Parabéns player, você ganhou!!!\n");
				}
				mapa.imprimirMapa();
			}while(jogador.getVida()>0 && !(i == 0 && j == 0));
		entrada.close();
	}
}
