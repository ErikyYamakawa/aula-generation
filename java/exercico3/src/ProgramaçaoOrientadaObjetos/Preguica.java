package ProgramaçaoOrientadaObjetos;

public class Preguica extends Animal{
private String atividade; 
	
	public Preguica(String nome,String raca,String emitirSom,int idade,String atividade)
	{
		super(nome,raca,emitirSom,idade);
		this.atividade = atividade;
		
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do Preguiça" + getNome() + "\n raça do Preguiça " + getRaca() + "\n O Som que o preguiça emite " + getEmitirSom() + ""
				+ "\n idade do preguiça " + getIdade() + "\n qual a principal atividade" + atividade);
	}

}
