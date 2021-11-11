package exercicios;
import java.util.Scanner;
public class exercicioWhile2 {
	public static void main (String Args[]) {
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Digite o seu codigo ");
		int codigo = leia.nextInt();
		
		while(codigo >=1 && codigo <= 150 ) {
			
		
		System.out.println(" Entre com a sua idade ");
		int idade = leia.nextInt();
		
		System.out.println("\n\t\tMenu de opções");
		System.out.println("\n1- Feminino");
		System.out.println("\n2- Masculino");
		System.out.println("\n3- Outros");
		System.out.println("\n Digite a sua opção : ");
		int op =leia.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("1 Feminino");
			break;
		case 2:
			System.out.println("2 Masculino ");
			break;
		case 3:
			System.out.println("3 Outros ");
			break;
		}
		
		System.out.println("\n\t\tMenu de opções");
		System.out.println("\n1- Calma");
		System.out.println("\n2- Nervosa");
		System.out.println("\n3- Agressiva");
		System.out.println("\n Digite a sua opção : ");
		int op1 =leia.nextInt();
		
		switch (op1) {
		case 1:
			System.out.println("1 Calma");
			break;
		case 2:
			System.out.println("2 Nervosa ");
			break;
		case 3:
			System.out.println("3 Agressiva ");
			break;
			
		}
		System.out.println("Digite o seu codigo ");
		codigo = leia.nextInt();
		
		}
		
		
		
		
		
		
	}

}
