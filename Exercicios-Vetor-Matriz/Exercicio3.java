package VetoresMatrizes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	
		int[][] matriznum = new int[3][3];
		int l,c,maior10=0;
		
		Scanner read = new Scanner(System.in);
		
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++) 
			{
				System.out.print("Entre com um número "+"["+l+"]"+"["+c+"]"+": ");
				matriznum[l][c] = read.nextInt();
				
				if(matriznum[l][c]>10){
					maior10++;		
				}
			}
		}
		System.out.println("\nQuantidade de valores maiores que 10: "+maior10);

	}

}
