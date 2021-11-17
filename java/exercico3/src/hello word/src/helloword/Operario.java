package helloword;

public class Operario extends Pessoa {
	
	
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco,String cpf, int telefone, int idade , double valorproducao, double comisao)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.valorProducao = valorProducao;
		this.comissao 	= 	comissao;
		
	}
	public void imprimirInfo()
	{
		System.out.println("\n Nome do empregado :" + getNome()+"\n CPF :"+ getCpf()+"zn IDADE : "+ getIdade() + "\n telefone : "+ getTelefone() + "\n Endereço : "+ getEndereco() + "\n valor da Produção : " + valorProducao + "\nvalor da Comissao ;" + comissao);
		
	}
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
