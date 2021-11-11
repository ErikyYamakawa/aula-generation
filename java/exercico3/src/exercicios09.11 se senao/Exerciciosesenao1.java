package exercicios;
import java.util.Scanner;

public class Exercicioescolhacaso1 {
	public static void main (String Args[]) {
		Scanner leia = new Scanner (System.in);
		System.out.println(" Entre com um numero Inteiro A : ");
		int A = leia.nextInt();
		System.out.println(" Entre com um numero inteiro B : ");
		int B = leia.nextInt();
		System.out.println(" Entre com um numero Inteiro C : ");
		int C = leia.nextInt();
		
		if(A>B && A>C)
		{
			System.out.println(" o maior numero e o A :" + A);
		}
		else if(B>A && B>C)
		{
			System.out.println(" o maior numero e o B :" + B);
		}
		else if(C>A && C>B)
			System.out.println(" o maior numero e o c :" + C);
	}
	

}
