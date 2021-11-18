package sistemaponto;

public class Funcionario extends Pessoa {

	private String matricula;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String cpf, String matricula) {
		super(nome, cpf);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
