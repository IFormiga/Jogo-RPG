package jogo;

import java.util.Scanner;

public class Teste2 {
//	public static void main(String[] args) {
//		String x;
//		Scanner z = new Scanner(System.in);
//		x = z.nextLine();
//		if(x.equals("a")){
//			System.out.printf("Deu certo\n");
//		}
//		z.close();
//	}

	public static void main(String[] args) {
		Mapa_da_Dungeon mapa = new Mapa_da_Dungeon();
		Personagem jogador = new Personagem();
		String nome;
		Scanner entrada = new Scanner(System.in);
		String movimento = "W";
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
		
		mapa.imprimirMapa();
		System.out.printf("\n");
		
				if(movimento == "W"||movimento == "w"){
					i2 = i-1;
					mapa.setLocalizacao(jogador, i, j, i2, j2);
					i = i2;
				}
		mapa.imprimirMapa();
//				if(movimento == "A"||movimento == "a"){
//					j2 = j-1;
//					mapa.setLocalizacao(jogador, i, j, i2, j2);
//					j = j2;
//				}
//				if(movimento == "S"||movimento == "s"){
//					i2 = i+1;
//					mapa.setLocalizacao(jogador, i, j, i2, j2);
//					i = i2;
//				}
//				if(movimento == "D"||movimento == "d"){
//					j2 = j+1;
//					mapa.setLocalizacao(jogador, i, j, i2, j2);
//					j = j2;
//				}
//				
//				if((jogador.getVida()<=0)){
//					System.out.printf("É uma pena player, parece que você morreu!!!\n");
//				}
//				if((mapa.getPosicao(0, 0) == 'P')){
//					System.out.printf("Parabéns player, você ganhou!!!\n");
//				}
		entrada.close();
	}
}
