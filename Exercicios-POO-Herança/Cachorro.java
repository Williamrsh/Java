package Heranca;

public class Cachorro extends Animal {
	
	private boolean Latido;
	private boolean Correr;
	public Cachorro(String nome, String idade, String emitirSom,  boolean Latido, boolean Correr) {
		
		super(nome, idade, emitirSom);
		this.Latido = Latido;
		this.Correr = Correr;
	}
	public boolean isLatido() {
		return Latido;
	}
	public void setLatido(boolean latido) {
		Latido = latido;
	}
	public boolean isCorrer() {
		return Correr;
	}
	public void setCorrer(boolean correr) {
		Correr = correr;
	}



}
