package Polimorfismo;

public class Cachorro extends Animal {
	
	
	public Cachorro(String nome, String idade) {
		
		super(nome, idade);
	
	}

	@Override
	public void emitirSom(String som) {
		
		System.out.println("o som que o cachorro faz: " +som);
		
	}

	@Override
	public void correr(String tipos) {
		
		System.out.println("Como o cachorro corre: " +tipos);

		
	}
	


}
