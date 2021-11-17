package helloword;

public class Fornecedor extends Pessoa{
	
	private double valorCredito;
	private double valorDivida;
	public Fornecedor(String nome, String endereco,String cpf, int telefone, int idade , double valorCredito, double valordivida)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	public void imprimirInfo()
	{
		System.out.println("\n Nome do empregado :" + getNome()+"\n CPF :"+ getCpf()+"zn IDADE : "+ getIdade() + "\n telefone : "+ getTelefone() + "\n Endereço : "+ getEndereco() + " o valor de credito e de :" + valorCredito + " e o valor da Divida e de : " + valorDivida); 
	}
	
	public void obterSaldo()
	{
		double diferencaCredito = valorCredito - valorDivida;
		System.out.println("\n O saldo referente ao fornecedor e igual a  :" + diferencaCredito);
		
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

}
