package Repeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner read =  new Scanner(System.in);
		
		int idade,cont=1,sexo,op,pcalmos=0,mnervosos=0,hagressivos=0,ocalmos=0,pnervosos40=0,pcalmos18=0;

		System.out.println("Digite qual é sua idade: ");
		idade = read.nextInt();
		System.out.println("Digite qual é seu sexo:\nOpções:\n1-Feminino\n2-Masculino\n3-Outros ");
		sexo = read.nextInt();
		System.out.println("Digite qual é seu humor:\nOpções:\n1-Calma\n2-Nervosa\n3-Agressiva");
		op = read.nextInt();
		
		if(op==1){
			pcalmos++;
		}
		if(sexo==1 && op==2){
			mnervosos++;
		}
		if(sexo==2 && op==3){
			hagressivos++;
		}
		if(sexo==3 && op==1){
			ocalmos++;
		}
		if(idade>40 && op==2){
			pnervosos40++;
		}
		if(idade<18 && op==1){
			pcalmos18++;
		}
		while(cont<150) {
			
			if(op==1){
				pcalmos++;
			}
			if(sexo==1 && op==2){
				mnervosos++;
			}
			if(sexo==2 && op==3){
				hagressivos++;
			}
			if(sexo==3 && op==1){
				ocalmos++;
			}
			if(idade>40 && op==2){
				pnervosos40++;
			}
			if(idade<18 && op==1){
				pcalmos18++;
			}
			System.out.println("\n\nDigite qual é sua idade: ");
			idade = read.nextInt();
			System.out.println("\nDigite qual é seu sexo:\nOpções:\n1-Feminino\n2-Masculino\n3-Outros ");
			sexo = read.nextInt();
			System.out.println("\nDigite qual é seu humor:\nOpções:\n1-Calma\n2-Nervosa\n3-Agressiva");
			op = read.nextInt();
			cont++;
		}
				
		System.out.println("Número de pessoas calmas: "+pcalmos);
		System.out.println("Número de mulheres nervosas: "+mnervosos);
		System.out.println("Número de homens agressivos: "+hagressivos);
		System.out.println("Número de outros calmos: "+ocalmos);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: "+pnervosos40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: "+pcalmos18);

	}

}
