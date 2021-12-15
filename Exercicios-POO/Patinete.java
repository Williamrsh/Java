package POO;

public class Patinete {
	
	private String nomeDono;
	private String marca;
	private String cor;
	private double valor;
	
	public Patinete(String nomeDono,String marca, String cor, double valor) 
	{
		this.nomeDono = nomeDono;
		this.marca = marca;
		this.cor = cor;
		this.valor = valor;
	}
		public Patinete(String marca) 
		{	
			this.marca = marca;
		}
		public void printInfo(){
			System.out.println("\n"+nomeDono+" tem um patinete da marca "+ marca+ " a cor dele é "+cor+" e ele acabou custando "+valor);

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
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}

}
