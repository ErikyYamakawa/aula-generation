package TrabalhoSistemaPontos;

public class Funcionario extends SistemaPontos {
	 
	
	public Funcionario(String nome,String cpf, String matricula)
	{
		super("Funcionario");
	}
	@Override
	public void nome(String nomeFuncionario)
	{
		System.out.println("\n O nome do Funcionario e : "+ nomeFuncionario);
	}
	@Override
		public void cpf(String numCpf)
		{
			System.out.println("\no CPF do funcionario e :" + numCpf);
		}
	@Override
		public void matricula(String numMatricula)
		{
		System.out.println("\n a matricula do funcionario e :"+ numMatricula);
		}
	
	}

