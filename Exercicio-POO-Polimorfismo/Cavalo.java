package Polimorfismo;

public class Cavalo extends Animal{
	

	private boolean coice;

	public Cavalo(String nome, String idade,  boolean coice) {
		
		super(nome, idade);	
		this.coice= coice;
		
	}	
	public boolean isCoice() {
		return coice;
	}

	public void setCoice(boolean coice) {
		this.coice = coice;
	}
	@Override
	public void emitirSom(String som) {
		
		System.out.println("o som que o cavalo faz: " +som);
	}
	@Override
	public void correr(String tipos) {
		
		System.out.println("Como o cavalo corre: " +tipos);

	}
	

}
