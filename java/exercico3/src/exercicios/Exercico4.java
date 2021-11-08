package exercicios;

import java.util.Scanner;

public class Exercico4 {
	public static void main(String Args[]) {

		Scanner ler = new Scanner(System.in);

		System.out.println("entre com o valor de A");
		double A = ler.nextDouble();
		System.out.println("Entre com o valor de B");
		double B = ler.nextDouble();
		System.out.println("Entre com o valor de C");
		double C = ler.nextDouble();

		double R = Math.sqrt((A + B));
		double S = Math.sqrt((B + C));

		double D = (R + S) / 2;
		
		System.out.println("o valor de D e " + D);
		

	}

}
