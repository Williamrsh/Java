package VetoresMatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int[] numero = new int[6];
		int[] pares = new int[6];
		int[] impares = new int[6];
		int l,somaPares=0,quantImpares=0;
		
		Scanner read = new Scanner(System.in);
		
		for(l=0;l<6;l++)
		{
			System.out.println("\nDigite um numero: ");
			numero[l] = read.nextInt();
			
			if(numero[l]%2==0) {
				somaPares+=numero[l];
				pares[l]=numero[l];
				
				
			}else{
				quantImpares++;
				impares[l]=numero[l];
			}
		}
		
		System.out.println("\n\nNúmeros pares digitados: ");
		for(l=0;l<6;l++){
			System.out.print("["+pares[l]+"] ");
		}
		System.out.print("\n\nSoma dos números pares digitados: "+somaPares);
		
		System.out.println("\n\nNúmeros inpares digitados: ");
		for(l=0;l<6;l++){
			System.out.print("["+impares[l]+"] ");
		}
		System.out.print("\n\nQuantidade dos números inpares digitados: "+quantImpares);

	}

}
