package helloword;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cavalo cavalo = new Cavalo();
		Cachorro cachorro = new Cachorro();
		Preguica preguica = new Preguica();
		
		Animal animal = null;
		
		int n = (int)(Math.random()*3.0);
		
		System.out.println("\n o Numero escolhido foi :" +n);
		
		switch(n)
		{
		case 0: animal = cavalo;break;
		case 1: animal = cachorro;break;
		case 2: animal = preguica;break;
		default: System.out.println("\n Erro inesperado.....");
		}
		if(animal!=null)
		{
			animal.som(2);
		}


	}

}
