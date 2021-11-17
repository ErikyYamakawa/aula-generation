package helloword;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// instanciando um objeto da classe Automovel 
		Automovel auto1 = new Automovel("Vinicius Vinha","Celta" , " ABC-1234 ", 2014);
		auto1.imprimirInfo();
		System.out.println("\n Transferencia de Proprietario****");
		auto1.setNomeProprietario("Pedro Jones");
		auto1.imprimirInfo();
		
		Automovel auto2 = new Automovel("Marcela Almeida","Fusca","DEF-0245",1980);
		auto2.imprimirInfo();
		System.out.println("\n ***Mudança de placa***");
		auto2.setPlaca("CDE-2021");
		auto2.imprimirInfo();
		
		
	}

}
