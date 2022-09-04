package com.aristiane.beecrowd;

import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {
		
		/**
		 * Fa�a um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). 
		 * A f�rmula para calcular o volume �: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.

		Dica: Ao utilizar a f�rmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++), 
		assumem que o resultado da divis�o entre dois inteiros � outro inteiro.
		 */
		 System.out.println(Math.pow(2,2));
		int raio = 0;
		double pi = 3.14159;
		double volume = 0;
		
		Scanner leitor = new Scanner(System.in);
		raio =  leitor.nextInt();
		
		volume = (4/3.0) * pi * Math.pow(raio,3);
		
		System.out.println(String.format("VOLUME = %.3f" ,(volume)));
	
	}

}
