package helloword;

public class Cachorro extends Animal {
	public Cachorro()
	{
		super("Animal cachorro");
	}
	
	@Override
	public void som (int numToques)
	{
		for(int i=0;i<numToques;i++)
		{
			System.out.println("\n auau..auau....");
		}
	}

	
}
