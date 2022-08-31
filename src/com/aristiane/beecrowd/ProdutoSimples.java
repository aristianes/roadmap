package com.aristiane.beecrowd;

import java.util.Scanner;

public class ProdutoSimples {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int prod = 0;

		Scanner leitor = new Scanner(System.in);
		a = leitor.nextInt();

		b = leitor.nextInt();

		prod = a * b;

		System.out.println("PROD = " + prod);

	}

}
