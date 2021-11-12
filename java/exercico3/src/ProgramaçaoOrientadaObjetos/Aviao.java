package ProgramaçaoOrientadaObjetos;

public class Aviao {
	
	public String apelidoAviao;
	public String marcaAviao;
	public double comprimento;
	public double peso;
	
	
	public Aviao (String apelidoAviao,String marcaAviao,double comprimento,double peso)
	{
		this.apelidoAviao = apelidoAviao;
		this.marcaAviao = marcaAviao;
		this.comprimento = comprimento;
		this.peso = peso;
				
	}
	public void imprimirInfo()
	{
		System.out.println("\n '" + apelidoAviao + "' empresa do aviao " + marcaAviao +" e mede "+ comprimento + " metros e pesa "+ peso +"kg"); 
	}
	public String getApelidoAviao() {
		return apelidoAviao;
	}
	public void setApelidoAviao(String apelidoAviao) {
		this.apelidoAviao = apelidoAviao;
	}
	public String getMarcaAviao() {
		return marcaAviao;
	}
	public void setMarcaAviao(String marcaAviao) {
		this.marcaAviao = marcaAviao;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	

}
