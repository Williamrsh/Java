package Repeticao;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		int numero,cont=0,soma=0;
		float media=0;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = read.nextInt();
		if(numero == 0)
		{
			System.out.println("\nEncerrando o sistema");
		}else{
			do {
				if(numero%3==0) {
					cont++;
				soma+=numero;
							
				}
			
			System.out.println("Digite um numero: ");
			numero = read.nextInt();
		
			}while(numero !=0);
			if(cont==0) {
				System.out.println("Não tem numeros multiplos de 3");

			}else {
				media=soma/cont;
				System.out.println("A média dos numeros multiplos de 3 é "+media+".");
			}
		}
	}
}
