package ProgramaçaoOrientadaObjetos;

public class Cavalo extends Animal{
	
private String atividade; 
	
	public Cavalo(String nome,String raca,String emitirSom,int idade,String atividade)
	{
		super(nome,raca,emitirSom,idade);
		this.atividade = atividade;
		
	}
	public void imprimirInfo()
	{
		System.out.println("\n Nome do Cavalo" + getNome() + "\n raça do cavalo " + getRaca() + "\n O Som que o cavalo emite " + getEmitirSom() + "\n idade do cavalo " + getIdade() + "\n qual a principal atividade" + atividade);
	}

}
