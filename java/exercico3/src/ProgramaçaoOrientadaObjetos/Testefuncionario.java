package ProgramaçaoOrientadaObjetos;

public class Testefuncionario {
	public static void main(String Args[]) {
	
	Funcionario funcionario1 = new Funcionario("Eriky Yamakawa","Generation",26,1.77,60);
	funcionario1.imprimirInfo();
	
	System.out.println("Mudar o nome do funcionario");
	funcionario1.setNomeFuncionario("Vanessa Okubo");
	funcionario1.setNomeEmpresa("PagBank");
	funcionario1.setIdade(31);
	funcionario1.setAltura(1.53);
	funcionario1.setPeso(50);
	
	funcionario1.imprimirInfo();
	
	
		
		
		
		
	}

}
