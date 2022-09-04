package com.aristiane.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class MediaTwo {

	public static void main(String[] args) {

		/**
		 * Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de
		 * um aluno. A seguir, calcule a média do aluno, sabendo que a nota A
		 * tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que
		 * cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
		 */

		double a = 0;
		double b = 0;
		double c = 0;

		int somPeso = 10;

		Scanner leitor = new Scanner(System.in);

		leitor.useLocale(Locale.US);
		a = leitor.nextDouble();
		b = leitor.nextDouble();
		c = leitor.nextDouble();

		double media = ((a * 2) + (b * 3) + (c * 5)) / somPeso;
		System.out.println(String.format("MEDIA = %.1f", media));

	}

}
