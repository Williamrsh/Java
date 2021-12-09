package Familia41;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int anos, meses, dias;
		
		System.out.println("Digite quantos dias de vida voce tem: ");
		dias = leia.nextInt();
		
				anos =dias/3655;
				dias =dias%365;
				meses=dias/30;
				dias=dias%30;
		
		System.out.println(	"Voce tem "+ anos +" ano(s) e "+meses+" mese(s) e "+dias+" dia(s) de vida.");
		
				
				
	}

}
