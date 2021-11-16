package ProgramaçaoOrientadaObjetos;

public class Animal {
	
	private String nome;
	private String raca;
	private String emitirSom;
	private int idade;
	
	public Animal(String nome,String raca,String emitirSom,int idade)
	{
		this.nome = nome;
		this.raca = raca;
		this.emitirSom = emitirSom;
		this.idade = idade;	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
