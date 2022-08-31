package com.aristiane.beecrowd;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {

		double n = 3.14159;
		double raio = 0;
		double area = 0;

		Scanner leitor = new Scanner(System.in);

		raio = leitor.nextDouble();
		area = n * raio * raio;

		System.out.println(String.format("A=%.4f", area));

	}

}
