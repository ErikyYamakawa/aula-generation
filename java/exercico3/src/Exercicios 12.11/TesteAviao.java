package ProgramaçaoOrientadaObjetos;

public class TesteAviao {
	public static void main(String Args[]) {
		
		
		Aviao aviao1 = new Aviao ("Jumbo","Varig",50.0,1000);
		aviao1.imprimirInfo();
		System.out.println("\n Transferencia de Apelido****");
		aviao1.setApelidoAviao("Abelhao");
		aviao1.imprimirInfo();
		
		
		
	}

}
