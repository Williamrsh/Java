package Repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int idade,anos21=0,anos50=0;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = read.nextInt();
		
		while(idade !=-99) {
			
			if(idade<21){
				anos21++;
			}
			if(idade>50) {
				anos50++;
			}
			System.out.println("Digite sua idade: ");
			idade = read.nextInt();
		}
		System.out.println("Total de pessoas com menos de 21 anos: "+anos21+"\nTotal de pessoas com mais de 50 anos: "+anos50);	
	}

}
