package exercicios;
import java.util.Scanner;
public class RepeticaoWhile {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		float numeros,somaNumeros=0;
		
		System.out.println("Entre com um numero :");
		numeros = leia.nextFloat();
		
		while(numeros!=0) {
			somaNumeros += numeros;
			System.out.println("Entre com um numero :");
			numeros = leia.nextFloat();
			
		}
		System.out.println("Somatorio dos numeros :"+ somaNumeros);
		
	}

}
