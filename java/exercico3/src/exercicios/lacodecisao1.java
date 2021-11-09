package exercicios;

import java.util.Scanner;

public class lacodecisao1 {
	public static void main(String args[]) {

		float n1, n2, n3, media;
		Scanner leia = new Scanner(System.in);

		System.out.println("entre com a primeira nota : ");
		n1 = leia.nextFloat();
		System.out.println("entre com a segunda nota : ");
		n2 = leia.nextFloat();
		System.out.println("entre com a terceira nota : ");
		n3 = leia.nextFloat();

		media = (n1 + n2 + n3) / 3;
		System.out.println("MEdia aritimetica :" + media);

		if (media > 7 && media <= 10) {
			System.out.println("Aluno aprovad0");

		} else if (media >= 5 && media < 7) {
			System.out.println("Aluno de exame");
		} else if (media >= 0 && media < 5) {
			System.out.println("aluno reprovado");

		} else {
			System.out.println("media fora do intervalo de notas");

		}

	}

}
