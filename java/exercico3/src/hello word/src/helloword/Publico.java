package helloword;

public class Publico extends Telefone {
	
	public Publico()
	{
		super("Telefone Publico");
	}
	
	@Override
	public void toca(int numToques)
	{
		for(int i=0;i<numToques;i++)
		{
			System.out.println("tririrrim........");
			
		}
	}
	@Override
	public void disca(String numero)
	{
		if(numero.charAt(0)=='9'|| numero.charAt(0)=='8')
		{
			System.out.println("\n Este telefone não liga para um celular....");
		}
		else
		{
			System.out.println("\n Discando : "+ numero);
		}
	}

}
