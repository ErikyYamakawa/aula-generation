package exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String Args[]) {
		Scanner ler = new Scanner(System.in);

		System.out.println("entre com o tempo em segundos ");
		int segundosTotal = ler.nextInt();
		int minutos = ((segundosTotal / 60) % 60);
		int horas = ((segundosTotal / 60) / 60);
		int segundos = (((segundosTotal / 60) % 60) % 60);
		System.out.println("o tempo do evento foi de " + horas + " horas " + minutos + " minutos " + segundos + " segundos");

	}

}
