package Condicao;

import java.util.Scanner;

public class ExercicioCondicional1 {

	public static void main(String[] args) {
		
		int N1,N2,N3;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		N1 = read.nextInt();
		System.out.println("Digite o Segundo numero:");
		N2 = read.nextInt();
		System.out.println("Digite o Terceiro numero:");
		N3 = read.nextInt();
		
		
		if(N1>N2 && N1>N3){
			
			System.out.println("\nO primeiro numero é o maior");

		}
		else if(N2>N1 && N2>N3){
			
			System.out.println("\nO Segundo numero é o maior");
		}
		else if(N3>N1 && N3>N2){
			
			System.out.println("\nO Terceiro numero é o maior");
		}else {
			System.out.println("Um dos numeros são iguais");
		}
	}

}
