package TrabalhoSistemaPontos;

public abstract class SistemaPontos {

	private String tipo;

	abstract public void nome(String nomeFuncionario);

	abstract public void cpf(String numCpf);

	abstract public void matricula(String numMatricula);

	
			
	
	/*Date data = Calendar.getInstance().getTime();
		SimpleDateFormat dft = new SimpleDateFormat("HH:mm");
		dft = new SimpleDateFormat("dd/MM/yyyy");
		String data_atual = dft.format(data);

		System.out.println("---- SISTEMA DE CONTROLE DE PONTO");
		System.out.println("DATA ATUAL:" + data_atual); */

	public SistemaPontos(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
