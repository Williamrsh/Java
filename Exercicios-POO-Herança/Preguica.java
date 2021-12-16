package Heranca;

public class Preguica extends Animal{

	private boolean SubirArvores;
	private boolean TemPelos;


	public Preguica(String nome, String idade, String emitirSom, boolean SubirArvores, boolean TemPelos) {
		
		super(nome, idade, emitirSom);
		this.SubirArvores = SubirArvores;
		this.TemPelos = TemPelos;

	}


	public boolean isSubirArvores() {
		return SubirArvores;
	}


	public void setSubirArvores(boolean subirArvores) {
		SubirArvores = subirArvores;
	}


	public boolean isTemPelos() {
		return TemPelos;
	}


	public void setTemPelos(boolean temPelos) {
		TemPelos = temPelos;
	}

}
