package exerciciopolimorfismo;

public class Cavalo extends Animal{
	
	public Cavalo()
	{
		super("Cavalo");
	}
	@Override
	public void som (int numToques)
	{
		for(int i=0;i<numToques;i++)
		{
			System.out.println("\n Relichar iririririri...");
			
		}
	}

}
