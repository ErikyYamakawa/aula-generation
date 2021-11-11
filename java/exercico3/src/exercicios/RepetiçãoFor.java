package exercicios;
import java.util.Scanner;
public class RepetiçãoFor {
	public static void main (String Args []) {
		float n1,n2,n3,media,mediaGeral,somaMedia=0;
		int x;
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=4;x++)
		{
			System.out.println("Emtre com a primeira nota : ");
			n1 = leia.nextFloat();
			System.out.println("Emtre com a segunda nota : ");
			n2 = leia.nextFloat();
			System.out.println("Emtre com a terceira nota : ");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3) /3;
			System.out.println("MEdia do aluno" + x +" foi de :"+ media);
			somaMedia += media;
			
		}
		mediaGeral = somaMedia/4 ;
		System.out.println("Media geral foi de :"+ mediaGeral);
		
	}

}
