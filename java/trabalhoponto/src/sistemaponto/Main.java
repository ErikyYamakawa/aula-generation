package sistemaponto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
			Scanner leia = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			
			
			System.out.println("Entre com a hora de chegada :");
			String entrada = leia.nextLine();
			
			Funcionario funcionario = new Funcionario();
			System.out.println("Entre com o nome");
			funcionario.setNome(leia.nextLine());
			System.out.println("Entre com a matrícula");
			funcionario.setMatricula(leia.nextLine());
			System.out.println("Entre com o cpf");
			funcionario.setCpf(leia.nextLine());
			
			System.out.println("Entre com o horario de saida");
			String saida = leia.nextLine();
			
			Date dateEntrada = sdf.parse(entrada);
			Date dateSaida = sdf.parse(saida);
			
			System.out.println("Entrada: " + dateEntrada);
			System.out.println("Saída: " + dateSaida);
			
			long horasTrabalhadas = dateSaida.getTime() - dateEntrada.getTime();
			
			Date dt = new Date(horasTrabalhadas);
			System.out.println("Horas Trabalhadas: " + sdf.format(dt));
			
			
			
			
			

	}
}
