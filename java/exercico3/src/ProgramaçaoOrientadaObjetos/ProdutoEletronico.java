package ProgramaçaoOrientadaObjetos;

public class ProdutoEletronico {
		public String produtoEletronico;
		public String marca;
		public double peso;
	
		public ProdutoEletronico (String produtoEletronico , String marca, double peso)
		{
			this.produtoEletronico = produtoEletronico;
			this.marca = marca;
			this.peso = peso;
					
		}
		public void imprimirInfo()
		{
			System.out.println("\n o cliente adiquiriu um "+ produtoEletronico + " da marca " + marca +" que pesa "+ peso + " kg "); 
		}
		
		public String getProdutoEletronico() {
			return produtoEletronico;
		}
		public void setProdutoEletronico(String produtoEletronico) {
			this.produtoEletronico = produtoEletronico;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
	
		

}
