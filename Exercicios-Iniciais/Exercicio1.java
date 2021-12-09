package Familia41;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int anos, meses, dias, idade;
		
		
		System.out.println("Digite a sua idade em anos: ");
		anos = leia.nextInt();
		System.out.println("Digite a sua idade em meses: ");
		meses = leia.nextInt();
		System.out.println("Digite a sua idade em dias:");
		dias = leia.nextInt();

		idade = anos*365 + meses*30 + dias;
		
		System.out.println("Você tem "+idade+ " dias de idade.");

		

	}

}
