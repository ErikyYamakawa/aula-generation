package exercicios;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String Args[]) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com o valor de custo de Fabrica do carro");
		double custFabr = ler.nextDouble();

		double custCons = (custFabr * 1.73);
		System.out.println("o valor do carro para o consumidor e de :" + custCons);

	}

}
