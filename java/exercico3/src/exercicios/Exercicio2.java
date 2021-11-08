package exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String Args[]) {
		Scanner ler = new Scanner(System.in);
		System.out.println("\n entre com a sua idade em dias ");
		int idade = ler.nextInt();
		int anos = (idade / 365);
		int meses = ((idade % 365) / 30);
		int dias = (meses % 30);

		System.out.println("a idade em anos e de" + anos + " " + meses + " meses " + dias + " dias");

	}

}
