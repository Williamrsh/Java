package POO;

public class Eletronico {
	
	private String nomeDono;
	private String marca;
	private int anoLancamento;
	
	
	public Eletronico(String nomeDono,String marca, int anoLancamento)
	{
		this.nomeDono = nomeDono;
		this.marca = marca;
		this.anoLancamento = anoLancamento;
	}
	public Eletronico(String marca) 
	{
		this.marca = marca; 
	}
	public void printInfo(){
		
		System.out.println("\n"+nomeDono+" tem um celular da marca "+marca+" que foi lançado em "+anoLancamento);
	}
	public String getNomeDono() {
		return nomeDono;
	}
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	
}
