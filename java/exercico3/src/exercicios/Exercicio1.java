package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);

		System.out.println("entre com a sua idade");
		int a = ler.nextInt();
		System.out.println(" entre com a sua idade em meses");
		int m = ler.nextInt();
		System.out.println("entre com a sua idade em dias");
		int d = ler.nextInt();

		int anos = (a * 365);
		int meses = (m * 30);
		int totalDias = (anos + meses + d);

		System.out.println(" o total de dias vivido foi de : " + totalDias);

	}

}
