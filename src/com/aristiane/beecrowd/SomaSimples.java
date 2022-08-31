package com.aristiane.beecrowd;

import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int soma = 0;
		Scanner leitor = new Scanner(System.in);
		a = leitor.nextInt();

		b = leitor.nextInt();

		soma = a + b;

		System.out.println("SOMA = " + soma);

	}

}
