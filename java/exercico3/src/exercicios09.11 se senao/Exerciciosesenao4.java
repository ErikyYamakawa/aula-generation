package exercicios;
import java.util.Scanner;
public class Exercicioescolhacaso4 {
	public static void main (String Args[]) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um numero qualquer inteiro");
		int n = leia.nextInt();
		
		if(n%2 == 0)
		{
		System.out.println("O numero e par");
		
		}
		else if (n%2 != 0 ) 
		{
		System.out.println(" O Numero e Impar");
		
		}
		if(n%2==0)
		{
			double raiz = Math.sqrt(n);
			System.out.println("A raiz quadrada de N e :" + raiz);
			
		}
		else if(n%2 !=0) 
		{
		double pot = Math.pow( n , 3);
		System.out.println("a potência do Numero N e :" + pot);
		
		}
		
		
		}

}
