package exercicios;
import java.util.Scanner;


public class Exercicioescolhacaso3 {
	public static void main (String Args[]) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade : ");
		int idade = leia.nextInt();
		
		if (idade>=10 && idade<=14)
		{
			System.out.println("O aluno esta na categoria Infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("o aluno esta na categoria Juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("o aluno esta na categoria Adulto");	
		}
		else 
		{
			System.out.println("o Aluno não se encontra em nenhuma categoria");
		}
		
	}

}
