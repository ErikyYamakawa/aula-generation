package exercicios;

import java.util.Scanner;

public class Escolhacaso {
	public static void main(String args[]) {
		int op;
		Scanner leia = new Scanner(System.in);
		System.out.println("\n\t\tMenu de op��es");
		System.out.println("\n1- S�bios");
		System.out.println("\n2- Gentil");
		System.out.println("\n3- Produtivo");
		System.out.println("\n4- Bem legal");
		System.out.println("\n Digite a sua op��o : ");
		op = leia.nextInt();
		switch (op) {
		case 1:
			System.out.println("\n s�bios..");
			break;
		case 2:
			System.out.println("\n gentil.. ");
			break;
		case 3:
			System.out.println("\n Produtivo.. ");
			break;
		case 4:
			System.out.println("\n Bem Legal.. ");
			break;
		default:
			System.out.println("Op��o invalida!! ");

		}

	}

}
