package exercicios;
import java.util.Scanner;
public class Exercicioescolhacaso2 {
	public static void main(String Args []) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um numero A :");
		float A = leia.nextFloat();
		System.out.println("Entre com um nnumero B :");
		float B = leia.nextFloat();
		System.out.println("nEntre com um numero C : ");
		float C = leia.nextFloat();
		
		if (A<B && A<C && B<C)
		{
			System.out.println(" a orde crescente dos numero A, B, e C são : " + A + " - " + B + " - " + C);
		}
		else if(B<A && B<C && C<A)
		{
			System.out.println(" a orde crescente dos numero A, B, e C são : " + B + " - " + C +" - " + A);
		}
		else if(A<C && A<B && C<B)
		{
			System.out.println(" a orde crescente dos numero A, B, e C são : " + A +" - " + C + " - " + B);
		}
		else if(C<B && C<A && B<A)
		{
			System.out.println(" a orde crescente dos numero A, B, e C são : " + C +" - " + B + " - " + A);
		}
		else if(C<B && C<A && A<B)
		{
			System.out.println(" a orde crescente dos numero A, B, e C são : " + C + " - " + A + " - " + B);
		}
		else if(B<C && B<A && A<C)
		{
			System.out.println(" a orde crescente dos numero A, B, e C são : " + B + " - " + A + " - " + C);
		}
			
		
	}

}
