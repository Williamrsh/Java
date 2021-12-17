package Polimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro  Apolo = new Cachorro ("Apolo","8");
		Preguica Bento  = new Preguica ("Bento","4",true);
		Cavalo Geronimo = new Cavalo ("Geronimo","9",true);
		System.out.println(Apolo.getNome());
		System.out.println(Bento.getNome());
		System.out.println(Geronimo.getNome());
		Apolo.correr("Simplesmente corre");
		Bento.correr("Sobe nas arvores");
		Geronimo.correr("Galopea");
		Apolo.emitirSom("Late");
		Bento.emitirSom("Grita");
		Geronimo.emitirSom("Relincha");
	}

}
