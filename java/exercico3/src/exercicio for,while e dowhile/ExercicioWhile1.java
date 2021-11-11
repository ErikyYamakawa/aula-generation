package exercicios;
import java.util.Scanner;
public class ExercicioWhile1 {
	public static void main (String Args[]) {
		Scanner leia = new Scanner(System.in);
		int idade,y=0,z=0;
		
		
		System.out.println("Entre om a sua idade");
		idade = leia.nextInt();
				
		while(idade != (-99)){
			if(idade<21) 
				y++;
			
			if (idade>50) 
				z++;
				System.out.println("Entre om a sua idade");
				idade = leia.nextInt();
		}
			System.out.println("A quantidade de pessoas com menos de 21 anos e de : " + y);
			System.out.println("A quantidade de pessoas com mais de 50 anos e de : " + z);
			
	}

}
