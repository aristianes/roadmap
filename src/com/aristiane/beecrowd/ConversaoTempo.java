package com.aristiane.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class ConversaoTempo {
	
	public static void main(String[] args) throws IOException {
		 
		Scanner scanner = new Scanner(System.in);
		int N;
		int horas;
		int minutos;
		int segundos;

		N = scanner.nextInt();

		horas = N / 3600;
		minutos = (N % 3600) / 60;
		segundos = (N % 3600) % 60;
		System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}
