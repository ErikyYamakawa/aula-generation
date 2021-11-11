package exercicios;
import java.util.Scanner;
public class RepeticaoDoWhile {
	public static void main (String Args[]) {
		int numero,somaNumero=0,contNumero=0;
		float media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println( "entre com um numero inteiro :");
		numero = leia.nextInt();
		
		do 
		{
			if(numero%2==0)
			{
				somaNumero += numero;
				contNumero++;
			}
			System.out.println( "entre com um numero inteiro :");
			numero = leia.nextInt();
			
		}while(numero%2==0);
		if(contNumero==0)
		{
			System.out.println("não é possivel fazer divisão por zero ");
			
		}
		else
		{
		media = somaNumero / contNumero;
		System.out.println("Media dos numeros pares" + media);
		}
		
	}

}
