package com.aristiane.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		/**
		 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre
		 * a diferença do produto de A e B pelo produto de C e D segundo a
		 * fórmula: DIFERENCA = (A * B - C * D).
		 * 
		 * Entrada O arquivo de entrada contém 4 valores inteiros.
		 */

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;

		Scanner leitor = new Scanner(System.in);

		leitor.useLocale(Locale.US);
		a = leitor.nextInt();
		b = leitor.nextInt();
		c = leitor.nextInt();
		d = leitor.nextInt();

		int DIFERENCA = (a * b - c * d);

		System.out.println("DIFERENCA = " + DIFERENCA);

	}

}
