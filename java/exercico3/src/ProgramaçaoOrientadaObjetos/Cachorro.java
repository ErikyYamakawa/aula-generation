package ProgramaçaoOrientadaObjetos;

public class Cachorro extends Animal{
	
	private String atividade; 
	
	public Cachorro(String nome,String raca,String emitirSom,int idade,String atividade)
	{
		super(nome,raca,emitirSom,idade);
		this.atividade = atividade;
		
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cachorro" + getNome() + "\n raça do cachorro " + getRaca() + "\nO Som que o cachorro emite " + getEmitirSom() + "\n idade do cachorro " + getIdade() + "\n qual a principal atividade" + atividade);
	}
	

}
