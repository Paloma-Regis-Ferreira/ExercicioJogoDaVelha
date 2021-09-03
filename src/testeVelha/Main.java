package testeVelha;

import java.util.Scanner;

public class Main {
	public static String[][] velha = new String [3][3];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		iniciarJogo();
		print();
		
		int n, n1;
		
		for(int i = 0; i < 9; i++) {
			if(i == 0 || i%2 == 0) {
				System.out.println("jogador 'X': ");
				System.out.println("ecolha linha e coluna ou digite '4' para sair do jogo:  ");
				n = sc.nextInt();
					if(n == 4) {
						jogada("X", 4, 4);
					}
				n1 = sc.nextInt();
				jogada("X", n, n1);
				print();
			}
			else{
				System.out.println("jogador 'O': ");
				System.out.println("ecolha linha e coluna ou digite '4' para sair do jogo:  ");
				n = sc.nextInt();
					if(n == 4) {
						jogada("X", 4, 4);
					}
				n1 = sc.nextInt();
				jogada("O", n, n1);
				print();
			}	
		}
		
		sc.close();
		
				
	}
	
	public static void print() {
		for(int i = 0; i<velha.length; i++) {
			for(int j = 0; j< velha[i].length; j++) {
				System.out.print(velha[i][j]);
				if(j+1 == velha[i].length) {
					System.out.println();
				}
			}
		}
	
	}
	
	public static void iniciarJogo() {
		
		for(int i = 0; i<velha.length; i++) {
			for(int j = 0; j< velha[i].length; j++) {
				if(j == 0) {
				}
				velha[i][j] = "__|";
				
				if(j+1 == velha[i].length) {
				velha[i][j] = "__";
				}
				if(i+1 == velha.length && j+1 != velha[i].length ) {
					velha[i][j] = "  |";
				}
				if(i+1 == velha.length && j+1 == velha[i].length ) {
					velha[i][j] = "  ";
				}
			}
		}
		
	}
	
	public static void jogada(String valor, int linha, int coluna) {
		if(linha == 4) {
			System.out.println("fim do jogo");
			return;
		}
		
		
		
		for(int i = 0; i<velha.length; i++) {
			for(int j = 0; j<velha[i].length; j++) {
				if(coluna == j+1 && i+1 == linha) {
					if(j +1 == velha[i].length) {
						velha[i][j] = valor;
						break;
					}
				velha[i][j] = valor + " |";
				break;
				}
			}
			if(i+1 == linha)
				break;
		}
	}
	
	public static void vencedor() {
		
		for(int i = 0; i < 1; i++) {
			String[] vencedor = new String[2];
			
			for(int j = 0; j < vencedor.length; j++) {
				vencedor[j] = velha[j][j];
			}
			if(vencedor[0] == vencedor[1] && vencedor[0] == vencedor[2]) {
				System.out.println("vencedor é : " + vencedor[0]);
			}
		}
		
		for(int i = 0; i < 2; i++) {
			String[] vencedor = new String[2];
			
			for(int j = 0; j < vencedor.length; j++) {
				vencedor[j] = velha[j][i];
			
				if(vencedor[0] == vencedor[1] && vencedor[0] == vencedor[2]) {
				System.out.println("vencedor é : " + vencedor[0]);
				}
			}
		}
	}
}
	
	/*public static boolean validar (int linha, int coluna) {
		for(int i = 0; i<velha.length; i++) {
			for(int j = 0; j<velha[i].length; j++) {

				if(i == linha && j == coluna && velha[i][j] == null) {
						velha[i][j] = "ocupado";
						return true;
				}
			}
			
		}

		return false;

	}
	
}*/
