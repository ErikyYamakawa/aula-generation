package exercicios;
import java.util.Scanner;
public class ExercicioFor1 {
	public static void main(String Ar[]) {
		Scanner leia = new Scanner(System.in);
		int x,numero;
		
		for(x=1000;x<=1999;x++) {
		
		if(x%11==5) {
			System.out.println(""+ x);
		}
		
		}
	}

}
