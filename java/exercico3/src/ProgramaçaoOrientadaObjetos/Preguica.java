package Programa�aoOrientadaObjetos;

public class Preguica extends Animal{
private String atividade; 
	
	public Preguica(String nome,String raca,String emitirSom,int idade,String atividade)
	{
		super(nome,raca,emitirSom,idade);
		this.atividade = atividade;
		
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do Pregui�a" + getNome() + "\n ra�a do Pregui�a " + getRaca() + "\n O Som que o pregui�a emite " + getEmitirSom() + ""
				+ "\n idade do pregui�a " + getIdade() + "\n qual a principal atividade" + atividade);
	}

}
