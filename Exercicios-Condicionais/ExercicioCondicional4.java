package Condicao;
import java.util.Scanner;

public class ExercicioCondicional4 {

	public static void main(String[] args) {
	
		double numero;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nDigite um numero: ");
		numero = read.nextInt();
		
		
		if(numero%2==0) {
			
			System.out.println("Raiz: " + Math.sqrt(numero));
			
		}else{
			System.out.println("Potencia: " + Math.pow(numero, 2));
		}
	}

}
