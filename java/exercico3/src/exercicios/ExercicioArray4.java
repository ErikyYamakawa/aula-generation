package exercicios;

import java.util.Scanner;

public class ExercicioArray4 {
	public static void main(String Args[]) {
		float[][] array1 = new float[2][2];
		float[][] array2 = new float[2][2];
		float[][] array3 = new float[2][2];
		int linha, coluna, var, op;
		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < 2; linha++) {
			for (coluna = 0; coluna < 2; coluna++) {
				System.out.println("Entre com os valore do arra1");
				array1[linha][coluna] = leia.nextFloat();
				System.out.println("Entre com os valore do arra1");
				array2[linha][coluna] = leia.nextFloat();
			}
		}
		do {
			System.out.println("\n\t\t MEnu de opções ");
			System.out.println("(1) somar as duas matrizes ");
			System.out.println("(2) Subtrair a primeira matriz da segunda ");
			System.out.println("(3) Adicionar uma contstante as duas matrizes ");
			System.out.println("(4) Imprimir as matrizes  ");
			System.out.println("(5) Sair do Programa!!!  ");
			System.out.println(" Digite a sua opção :  ");
			op = leia.nextInt();

			switch (op) {
			case 1:
				for (linha = 0; linha < 2; linha++) {
					for (coluna = 0; coluna < 2; coluna++) {
						array3[linha][coluna] = array1[linha][coluna] + array2[linha][coluna];
						System.out.println("Soma :" + array3[linha][coluna]);
					}
				}
				break;
			case 2:
				for (linha = 0; linha < 2; linha++) {
					for (coluna = 0; coluna < 2; coluna++) {
						array3[linha][coluna] = array1[linha][coluna] - array2[linha][coluna];
						System.out.println("Subtração :" + array3[linha][coluna]);
					}
				}
				break;
			case 3:
				System.out.println(" Entre com um valor");
				var = leia.nextInt();
				for (linha = 0; linha < 2; linha++) {
					for (coluna = 0; coluna < 2; coluna++) {
						array1[linha][coluna] = array1[linha][coluna] + var;
						array2[linha][coluna] = array2[linha][coluna] + var;
						System.out.println("Variavel somada ao array1 :" + array1[linha][coluna]);
						System.out.println("Variavel somada ao array2 :" + array2[linha][coluna]);
					}
				}
				break;
			case 4:
				for (linha = 0; linha < 2; linha++) {
					for (coluna = 0; coluna < 2; coluna++) {
						System.out.println(" array1 :" + array1[linha][coluna]);
						System.out.println(" array2 :" + array2[linha][coluna]);
					}
				}
				break;
			case 5:
				System.out.println("Muito obrigado por utilizar o nosso sistema e volte sempre!!");
				break;

			default:
				System.out.println("Opção invalida!!!Por favor digite uma outra opção");

			}
		} while (op != 5);

	}

}
