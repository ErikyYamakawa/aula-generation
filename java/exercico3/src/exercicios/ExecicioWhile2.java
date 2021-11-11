package exercicios;
import java.util.Scanner;

public class ExecicioWhile2 {
	public static void main (String Args[]) {
		int idade,genero,fp,contpc=0,contmn=0,contha=0,contho=0,contpn=0,contpc18=0,contpn40,x=1;
		Scanner leia = new Scanner (System.in);
		while(x<=5)
		{
			System.out.println("Entre com a sua idade : ");
			idade = leia.nextInt();
			while(idade <= 0 || idade >= 125)
			{
				System.out.println("Entre com a sua idade : ");
				idade = leia.nextInt();
			}
		}
		System.out.println(" Entre com o seu Genero :\n1 feminino \n2masculino \n3 Outros ");
		genero = leia.nextInt();
		while(genero<1 || genero>3)
		{
			System.out.println("Entre com a sua idade : ");
			idade = leia.nextInt();
		}
		System.out.println("Entre com o seu fator Psicologico : \n1 Calme  \n2 Nervose  \n3 Agressive ");
		fp = leia.nextInt();
		while(fp<1 || fp>3)
		{
			System.out.println("Entre com o seu fator Psicologico : \n1 Calme  \n2 Nervose  \n3 Agressive ");
			fp = leia.nextInt();
		}
		if(fp==1)
		{
			contpc++;
		}
		if(genero==1 && fp ==2)
		{
			contmn++;
		}
		if(genero==2 && fp==3)
		{
			contha++;
		}
		if(genero==3 && fp==1)
		{
			contho++;
		}
		if(fp==2 && idade>40)
		{
			contpn40++;
		}
		if(fp==1 && idade<18)
		{
			contpc18++;
		}
		
		x++;
		
		System.out.println(" pessoas calma" +contpc );
		System.out.println("mulheres nervosas " + contmn );
		System.out.println("homens agressivos " + contha );
		System.out.println("outros calmos " + contho );
		System.out.println("pessoas nervosas acima de 40 anos " + contpn40 );
		System.out.println("pessoas nervosas menos de 18 anos " + contpc18 );
		
	}
	
	
	
	

	
	 	
	
	

}
