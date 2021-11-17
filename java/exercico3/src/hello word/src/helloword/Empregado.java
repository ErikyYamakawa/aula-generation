package helloword;

public class Empregado extends Pessoa {
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado(String nome,String endereco,String cpf, int telefone,int idade, int codigoSetor, float salarioBase, float imposto)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto	=	imposto;
		
	}
	public void imprimirInfo()
	{
		System.out.println("\n Nome do empregado :" + getNome()+"\n CPF :"+ getCpf()+"zn IDADE : "+ getIdade() + "\n telefone : "+ getTelefone() + "\n Endereço : "+ getEndereco() + "\n Codigo do Setor : " + codigoSetor+ "Salario Base" + salarioBase + "\n Valor em porcentagem(sem o %) de imposto a ser retido do salario : " + imposto);
	}
	
	public void calcularSalario()
	{
		double salarioTotal = salarioBase -(salarioBase*(imposto/100));
		System.out.println(" O salario a ser recebido pelo empregado : "+ getNome() + " é igual a : "+salarioTotal);
	}
}
