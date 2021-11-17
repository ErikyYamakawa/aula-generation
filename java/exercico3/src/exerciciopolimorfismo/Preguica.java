package exerciciopolimorfismo;

public class Preguica extends Animal {
	public Preguica()
	{
		super("Preguica");
	}
	
	@Override
	public void som (int numToques)
	{
		for(int i=0;i<numToques;i++)
		{
			System.out.println("\n não faz nenhum som...");
			
		}
	}

}
