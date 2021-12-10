package Repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	
		int numero, soma=0;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = read.nextInt();
		
		if(numero == 0)
		{
			System.out.println("\nEncerrando o sistema");
		}else{
	
			do
			{
				soma+=numero;
			
			System.out.println("Digite um numero:");
			numero = read.nextInt();	
			
			}while(numero!=0);
		
			System.out.println(soma);
		}
	}
}
