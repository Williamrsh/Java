package Polimorfismo;

public class Preguica extends Animal{

	private boolean TemPelos;
	
	
	@Override
	public void emitirSom(String som)
	{
		System.out.println("o som que a preguiça faz: " +som);

	}
	@Override
	public void correr(String tipos) {
	
		System.out.println("Como a Preguica faz: " +tipos);

	}
	public Preguica(String nome, String idade, boolean TemPelos) {
		
		super(nome, idade);

		this.TemPelos = TemPelos;

	}
	public boolean isTemPelos() {
		return TemPelos;
	}
	public void setTemPelos(boolean temPelos) {
		TemPelos = temPelos;
	}
}

