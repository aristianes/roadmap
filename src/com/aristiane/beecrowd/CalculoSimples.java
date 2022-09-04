package com.aristiane.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {

	public static void main(String[] args) {

		/**
		 * Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as
		 * 1, o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero
		 * de pe�as 2 e o valor unit�rio de cada pe�a 2. Ap�s, calcule e mostre
		 * o valor a ser pago.
		 * 
		 * Entrada O arquivo de entrada cont�m duas linhas de dados. Em cada
		 * linha haver� 3 valores, respectivamente dois inteiros e um valor com
		 * 2 casas decimais.
		 */

		int codigo1 = 0;
		int codigo2 = 0;
		
		int pecas1 = 0;
		int pecas2 = 0;
		
		double valor1 = 0;
		double valor2 = 0;
		double valor = 0;

		Scanner leitor = new Scanner(System.in);

		leitor.useLocale(Locale.US);
		codigo1 = leitor.nextInt();
		pecas1 = leitor.nextInt();
		valor1 = leitor.nextDouble();

		codigo2 = leitor.nextInt();
		pecas2 = leitor.nextInt();
		valor2 = leitor.nextDouble();

		valor = pecas1 * valor1 + pecas2 * valor2;
		

		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valor));

		/**
		 * Codigo do produto + quantidade de pe�as + valor unitario.
		 */

	}

}
