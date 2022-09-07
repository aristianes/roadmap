package com.aristiane.beecrowd;

import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int x = leitor.nextInt();
		double y = leitor.nextDouble();
		double media = x / y;

		System.out.println(String.format("%.3f km/l", media));

	}

}
