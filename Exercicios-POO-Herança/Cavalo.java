package Heranca;

public class Cavalo extends Animal{
	
	
	private boolean Correr;
	private boolean relinchando;
	private boolean coice;

	public Cavalo(String nome, String idade, String emitirSom, boolean Correr, boolean relinchando, boolean coice) {
		
		super(nome, idade, emitirSom);
		this.Correr = Correr;
		this.relinchando=relinchando;
		this.coice= coice;
		
	}

	public boolean isCorrer() {
		return Correr;
	}

	public void setCorrer(boolean correr) {
		Correr = correr;
	}

	public boolean isRelinchando() {
		return relinchando;
	}

	public void setRelinchando(boolean relinchando) {
		this.relinchando = relinchando;
	}

	public boolean isCoice() {
		return coice;
	}

	public void setCoice(boolean coice) {
		this.coice = coice;
	}
	

}
