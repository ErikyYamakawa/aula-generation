package ProgramaçaoOrientadaObjetos;

public class Funcionario {

	public String nomeFuncionario;
	public String nomeEmpresa;
	public int idade;
	public double altura;
	public double peso;
	
	
	public Funcionario(String nomeFuncionario, String nomeEmpresa, int idade, double altura, double peso )
	{
		this.nomeFuncionario = nomeFuncionario;
		this.nomeEmpresa = nomeEmpresa;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		
	}
	public void imprimirInfo()
	{
		System.out.println("\n "+ nomeFuncionario + " trabalha na empresa " + nomeEmpresa +" tem  "+ idade + " anos " + altura +" metros " + peso +"kg" ); 
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
