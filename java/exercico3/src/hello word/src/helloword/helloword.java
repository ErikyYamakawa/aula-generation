package helloword;
import java.util.Scanner;
public class helloword {

	public static void main(String args[]) {
		
		System.out.println("hello world");
		
		Scanner ler = new Scanner(System.in);
		System.out.println("quantos carrinhos arthur tem?");
		
		int atual = ler.nextInt();
		
		System.out.println("quantos carrinhos arthur comprou?");
		int compra = ler.nextInt();
		
		
		int totalcarrinhos = atual + compra;
		
		System.out.println("arthur ficou com " + totalcarrinhos + " carrinhos");
		
	}
	
}
