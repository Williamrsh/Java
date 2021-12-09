package Familia41;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int A, B, C;
		Double D;
		
		System.out.println("Digite o primeiro numero positivo: ");
		A = leia.nextInt();
		System.out.println("Digite o segundo numero positivo: ");
		B = leia.nextInt();
		System.out.println("Digite o terceiro numero positivo: ");
		C = leia.nextInt();

		D=(Math.pow((A+B), 2)+Math.pow((B+C), 2))/2;
		
		
		System.out.println("Resultado:" +D);
	}

}
