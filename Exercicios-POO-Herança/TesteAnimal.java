package Heranca;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro  Apolo = new Cachorro ("Apolo","8","Sim",true,true);
		Preguica Bento  = new Preguica ("Bento","4","Não",true,true);
		Cavalo Geronimo = new Cavalo ("Geronimo","9","SIM",true,true,true);
		System.out.println(Apolo.getNome());
		System.out.println(Bento.getNome());
		System.out.println(Geronimo.getNome());


	}

}
