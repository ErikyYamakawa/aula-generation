package exercicios;
import java.util.Scanner;

public class exercicioFor2 {
	public static void main (String Args[]) {
		int x,somaPar=0,somaImpar=0;
		double numero;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++) {
			System.out.println(" Entre com um numero ");
			numero = leia.nextDouble();
			if(numero % 2==0) 
				somaPar ++;
			 if (numero%2!= 0) 
				somaImpar ++;			
					
				
					
				
			
		}
		System.out.println("a quantida de numeros par e de : "+ somaPar);
		System.out.println("a quantidade de numeros impar e de : "+somaImpar);
		
		 
			
		}
		
		}
	


