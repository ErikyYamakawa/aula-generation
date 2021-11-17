package helloword;

public class Celular extends Telefone {
	
	public Celular()
	{
		super("Celular");	
	}
	@Override
	public void toca(int codigoToque)
	{
		switch(codigoToque)
		{
		case 1 :
			System.out.println("\nGeração Coca - Cola....");
			break;
		case 2 :
			System.out.println("\n Nokia tunes--Turururu");
			break;
			default:
			System.out.println("\nnzããzãzãzãzã.... ");
		}
	}
	@Override
	public void disca(String numero)
	{
		System.out.println("\n O numero : " + numero + " e um celular.....");
	}

}
