package com.aristiane.beecrowd;

import java.io.IOException;
import java.util.Scanner;

/*
 * Leia um valor inteiro correspondente � idade de uma pessoa em dias e informe-a em anos, meses e dias

 Obs.: apenas para facilitar o c�lculo, considere todo ano com 365 dias e todo m�s com 30 dias. 
 Nos casos de teste nunca haver� uma situa��o que permite 12 meses e alguns dias, como 360, 
 363 ou 364. Este � apenas um exerc�cio com objetivo de testar racioc�nio matem�tico simples.
 Entrada
 O arquivo de entrada cont�m um valor inteiro.
 Sa�da
 Imprima a sa�da conforme exemplo fornecido.
 */

public class IdadeDias {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int a, anos, meses, dias;

		a = scanner.nextInt();

		anos = a / 365;
		meses = (a % 365) / 30;
		dias = (a % 365) % 30;
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");

	}

}
