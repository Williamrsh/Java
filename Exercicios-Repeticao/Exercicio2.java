package Repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero,x=0,pares=0,impares=0;
		
		for(x=1;x<=10;x++) {
			System.out.println("\nDigite o "+x+"º numero: ");
			numero = read.nextInt();
			
			if(numero%2==0){
				pares++;
			}
			else {
				impares++;
			}
		}
			System.out.println(pares+" numero(s) são par(es) e "+impares+" são impar(es).");
			
	}

}
