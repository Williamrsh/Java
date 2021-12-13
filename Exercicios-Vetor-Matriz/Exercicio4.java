package VetoresMatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float[][] matriz = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matrizS = new float[2][2];
		float[][] matrizD = new float[2][2];
		int l,c,menu=0;
		final double valor = 10.50;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("\nMatriz 1 ");
		for(l=0; l<2; l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.print("\nEntre com um número da Matriz 1"+"["+l+"]"+"["+c+"]"+": ");
				matriz[l][c] = read.nextFloat();

			}
		}	
		System.out.print("\nMatriz 2 ");
		for(l=0; l<2; l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.print("\nEntre com um número da Matriz 2"+"["+l+"]"+"["+c+"]"+": ");
				matriz2[l][c] = read.nextFloat();
			}
					
		}	
		
		System.out.println("\nEscolha uma opção:");
		System.out.println("\n(1) Somar as duas matrizes");	
		System.out.println("\n(2) Subtrair a primeira matriz da segunda");
		System.out.println("\n(3) Adicionar uma constante as duas matrizes"); 
		System.out.println("\n(4) Imprimir as matrizes");
		menu= read.nextInt();
						
						
			switch(menu) {
			case 1:
				for(l=0; l<2; l++)
				{
					for(c=0;c<2;c++)
					{
						matrizS[l][c]=matriz[l][c]+matriz2[l][c];
					}
				}
				System.out.println("A soma das duas matrizes: ");
				for(l=0; l<2; l++)
				{
					for(c=0;c<2;c++)
					{
						System.out.printf("\t %2.1f \t",matrizS[l][c]);
					}
					System.out.println();
				}
				break;
			case 2:
				for(l=0; l<2; l++)
				{
					for(c=0;c<2;c++)
					{
						matrizD[l][c]=matriz[l][c]-matriz2[l][c];
					}
				}
				System.out.println("A soma das duas matrizes: ");
				for(l=0; l<2; l++)
				{
					for(c=0;c<2;c++)
					{
						System.out.printf("\t %2.1f \t",matrizD[l][c]);
					}
					System.out.println();
				}
				break;
			case 3:
				for(l=0; l<2; l++)
				{
					for(c=0;c<2;c++)
					{
						matriz[l][c]+=valor;
						matriz2[l][c]+=valor;
					}
				}
				System.out.println("\n Matriz 1 com a constante:");
				for(l=0; l<2; l++)
				{
					for(c=0;c<2;c++)
					{
						System.out.printf("\t %2.1f \t",matriz[l][c]);
					}
					System.out.println();
				}
				System.out.println("\n Matriz 2 com a constante:");
				for(l=0; l<2; l++)
				{
					for(c=0;c<2;c++)
					{
						System.out.printf("\t %2.1f \t",matriz2[l][c]);
					}
					System.out.println();
				}
				
				break;
			case 4:
				System.out.println("\n Matriz 1:");
				for(l=0; l<2; l++)
				{
					for(c=0;c<2;c++)
					{
						System.out.printf("\t %2.1f \t",matriz[l][c]);
					}
					System.out.println();
				}
				System.out.println("\n Matriz 2:");
				for(l=0; l<2; l++)
				{
					for(c=0;c<2;c++)
					{
						System.out.printf("\t %2.1f \t",matriz2[l][c]);
					}
					System.out.println();
				}
				
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
	
	}

}
