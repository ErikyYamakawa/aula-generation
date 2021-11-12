package ProgramaçaoOrientadaObjetos;

public class ExercicioPOO1 {
	private String nomeCliente;
	private int idade;
	private double altura;
	
	public ExercicioPOO1 (String nomeCliente, int idade, double altura)
	{
		this.nomeCliente = nomeCliente;
		this.idade = idade;
		this.altura = altura;
				
	}
	public ExercicioPOO1(int idade)
	{
		this.idade = idade;
	}
	public void imprimirInfo()
	{
		System.out.println("\n"+ nomeCliente + " tem " + idade +" anos e mede : " + altura ); 	
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	

}
