package Condicao;
import java.util.Scanner;

public class ExercicioCondicional2 {

	public static void main(String[] args) {

		int N1,N2,N3;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		N1 = read.nextInt();
		System.out.println("Digite o Segundo numero:");
		N2 = read.nextInt();
		System.out.println("Digite o Terceiro numero:");
		N3 = read.nextInt();

		
		if(N1<=N2 && N2<=N3)
		{
			System.out.println("\nCrescente:\n"+N1+"\n"+N2+"\n"+N3);
		}
		else if(N1<=N3 && N3<=N2)		
		{
			System.out.println("\nCrescente:\n"+N1+"\n"+N3+"\n"+N2);
		}
		else if(N2<=N1 && N1<=N3)
		{
			System.out.println("\nCrescente:\n"+N2+"\n"+N1+"\n"+N3);
		}
		else if(N2<=N3 && N3<=N1)
		{
			System.out.println("\nCrescente:\n"+N2+"\n"+N3+"\n"+N1);
		}
		else if(N3<=N1 && N1<=N2)
		{
			System.out.println("\nCrescente:\n"+N3+"\n"+N1+"\n"+N2);
		}
		else 
		{
			System.out.println("\nCrescente:\n"+N3+"\n"+N2+"\n"+N1);
		}
	}
}
