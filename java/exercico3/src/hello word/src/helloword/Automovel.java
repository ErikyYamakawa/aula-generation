package helloword;

public class Automovel {
	
	
	// declara��o dos atributos da classe 
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	
	//declarar o metodo construtor
	public Automovel (String nomeProprietario,String modelo,String placa, int ano)// parametro ou argumento.
	{
		this.nomeProprietario = nomeProprietario;// todo atributo vem com a referencia this
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}
	
	public Automovel(int ano)
	{
		this.ano = ano;
	}
	
	//declara�ao dos demais metodo da classe 
	public void imprimirInfo()
	{
		System.out.println("\n"+ nomeProprietario + " possui um(a) " + modelo +" com placa "+ placa + " e ano :"+ ano); 
	}
	
	//cria�ao dos metodos get e set (SOURCE) (generate getter and setters)

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	 
	
	
	
}
