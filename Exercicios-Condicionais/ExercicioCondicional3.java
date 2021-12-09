package Condicao;
import java.util.Scanner;

public class ExercicioCondicional3 {

	public static void main(String[] args) {
		
		
		int idade;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade: ");
		idade = read.nextInt();
		
		if(idade<=25 && idade>=18) {
			System.out.println("\nAdulto");
		}
		else if(idade<=17 &&  idade>=15) {
			System.out.println("\nJuvenil");
		}
		else if(idade<=14 && idade>=10) {
			System.out.println("\nInfantil");
		}else {
			System.out.println("\nDigite uma idade válida");
		}
		
	}

}
