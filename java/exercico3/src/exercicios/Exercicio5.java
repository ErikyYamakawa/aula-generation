package exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String Args[]) {

		float n1, n2, n3, media;

		Scanner ler = new Scanner(System.in);

		System.out.println(" entre com a primeira nota ");
		n1 = ler.nextFloat();
		System.out.println(" entre com a segunda nota ");
		n2 = ler.nextFloat();
		System.out.println(" entre com a terceira nota ");
		n3 = ler.nextFloat();

		media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
		System.out.println("Sua media foi de :" + media);
		System.out.printf("Sua media foi de :%.2f", media);

	}

}
