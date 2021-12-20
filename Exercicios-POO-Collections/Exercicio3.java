package Collections;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	
		int op = 0;
		boolean continueLoop;
		String produto, verifica, produtor,novo;
		Scanner leia = new Scanner (System.in);
		ArrayList <String> estoque = new ArrayList();
		
		do
		{
			do{
			do {
				continueLoop = true;	
			try {	
			System.out.println("---------------------------------------------");
			System.out.println("\n\t\tMenu do meu Estoque");
			System.out.println("\n(1) Adicionar um produto no estoque");
			System.out.println("\n(2) Remover um produto do estoque");
			System.out.println("\n(3) Atualizar um produto no estoque");
			System.out.println("\n(4) Mostrar todos os proudtos do estoque");
			System.out.println("\n(0) Sair do programa");
			System.out.println("\nDigite a sua opção?");
			System.out.println("---------------------------------------------");
			op = leia.nextInt();
			}catch(InputMismatchException inputMismatchException)
			{continueLoop = false;
			System.err.printf("\nException: %s\n",inputMismatchException);
			leia.nextLine();
			System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
			}
			}while(continueLoop==false);
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar no estoque: ");
				 produto = leia.nextLine();
				if(estoque.contains(produto)) {
					System.out.println("\nProduto ja adcionado");

				}else {
					estoque.add(produto);
					System.out.println("\nAdicionado ");
				}
				
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque:");
				 produtor = leia.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto não existe no estoque!!!");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar:");
				verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do produto: "+verifica+" : ");
				novo =  leia.nextLine();
				if(estoque.contains(verifica)) 
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existe!!!");
				}
				System.out.println(estoque);
				break;
			case 4:
				System.out.println("\nMostrar os produtos do estoque?");
				System.out.println(estoque);
			
				break;
			case 0:
				System.out.println("\nPrograma finalizado");
				break;
			default: System.out.println("\nOpção inválida. Digte novamente:");
			do{
				do {
					continueLoop = true;	
				try {	
				System.out.println("---------------------------------------------");
				System.out.println("\n\t\tMenu do Estoque");
				System.out.println("\n(1) Adicionar um produto no estoque");
				System.out.println("\n(2) Remover um produto do estoque");
				System.out.println("\n(3) Atualizar um produto no estoque");
				System.out.println("\n(4) Mostrar todos os produtos do estoque");
				System.out.println("\n(0) Sair do programa");
				System.out.println("\nDigite a sua opção?");
				System.out.println("---------------------------------------------");
				op = leia.nextInt();
				}catch(InputMismatchException inputMismatchException)
				{continueLoop = false;
				System.err.printf("\nException: %s\n",inputMismatchException);
				leia.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro.\nPor favor, tente novamente...");
				}
				}while(continueLoop==false);
				switch(op)
				{
				case 1:
					leia.nextLine();
					System.out.println("\nDigite o produto para adicionar no estoque: ");
					produto = leia.nextLine();
					if(estoque.contains(produto)) {
						System.out.println("\nProduto ja adcionado");

					}else {
						estoque.add(produto);
						System.out.println("\nAdicionado ");
					}
					
					break;
				case 2:
					leia.nextLine();
					System.out.println("\nDigite o produto para remover do estoque:");
					produtor = leia.nextLine();
					if(estoque.contains(produtor))
					{
						estoque.remove(produtor);
					}
					else
					{
						System.out.println("\nProduto não existe no estoque!!!");
					}
					break;
				case 3:
					leia.nextLine();
					System.out.println("\nDigite o produto que quer atualizar:");
					verifica = leia.nextLine();
					System.out.println("\nDigite o nome do produto que entrará no lugar do produto: "+verifica+" : ");
					novo =  leia.nextLine();
					if(estoque.contains(verifica)) 
					{
						estoque.remove(verifica);
						estoque.add(novo);
					}
					else
					{
						System.out.println("\nProduto não existe!!!");
					}
					System.out.println(estoque);
					break;
				case 4:
					System.out.println("\nMostrar os produtos do estoque?");
					System.out.println(estoque);
				
					break;
				case 0:
					System.out.println("\nPrograma finalizado");
					break;
				}
				}while(op<0 || op>4);
			}
		}while(op<0 || op>4);
		}while(op!=0);
	}
}
