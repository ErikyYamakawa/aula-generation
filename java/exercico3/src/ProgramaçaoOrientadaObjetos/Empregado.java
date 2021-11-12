package ProgramaçaoOrientadaObjetos;

import java.text.NumberFormat;

public class Empregado {
	
	private String nome;
	private Double salario;
	
	public Empregado(String n,double s)
	{
		this.setNome(n);
		this.setSalario(s);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual)
	{
		salario *= 1 + percentual/100;
	}
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();//verifica o pais de origem
		nf.setMinimumFractionDigits(2);// indica a quantidade de casas depois da virgula
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	public void imprimir()
	{
		System.out.println("\n "+ nome + "\t\t"+ "salario : "+this.formatarMoeda());
	}
	

}
