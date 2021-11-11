package exercicios;

import java.util.Scanner;

public class ExercicioArray2 {
	public static void main(String Args[]) {
		int[] numeros = new int[6];
		int x, numero, somaPar = 0, somaImpar = 0;
		Scanner leia = new Scanner(System.in);
		for (x = 0; x < 6; x++) {
			System.out.println("Entre com os valores no vetor");
			numero = leia.nextInt();
			if (numero % 2 == 0) {
				somaPar += numero;
			}
			if (numero % 2 != 0) {
				somaImpar += numero;
			}

		}

		System.out.println(" a soma dos numeros pares e de :" + somaPar);
		System.out.println(" a soma dos numeros impares e de : " + somaImpar);

	}
}
