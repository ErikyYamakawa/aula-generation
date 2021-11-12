package ProgramaçaoOrientadaObjetos;

public class TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado[] lista = new  Empregado[3];
		
		lista[0] = new Empregado("Thais Ribeiro",20000.00);
		lista[1] = new Empregado("Mirella Farias",25000.00);
		lista[2] = new Empregado("Lucas Celestino Diniz",75000.00);
		
		for(Empregado roda: lista)
		{
		roda.imprimir();	
		}
		
		System.out.println("********************************************************************");
		
		for(Empregado roda: lista)
		{
		roda.aumentarSalario(10);	
		roda.imprimir();
		}
		
		
		
	}

}
