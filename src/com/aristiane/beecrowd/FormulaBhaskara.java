package com.aristiane.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class FormulaBhaskara {
	/*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
	 * Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”,
	 *  caso haja uma divisão por 0 ou raiz de numero negativo.
	 *  Entrada
		Leia três valores de ponto flutuante (double) A, B e C.
		Saída
		Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". 
Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, 
com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
	 */

	public static void main(String[] args) throws IOException {
	
		Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
		
		double a = leitor.nextDouble();
		double b = leitor.nextDouble();
		double c = leitor.nextDouble();
		
		
		double r1 = 0;
		double r2 = 0;
		
		double delta = ((b*b)- (4*a*c));
		
		if((2*a ==0)|| (delta <0)){
			System.out.println("Impossivel calcular");
			
		}
		else{
			r1 = ((-1 * b) + Math.sqrt(delta))/(2*a);
			r2 = ((-1 * b) - Math.sqrt(delta))/(2*a);
			
			System.out.print("R1 = ");
			System.out.printf("%.5f", r1);
			System.out.print("\nR2 = ");
			System.out.printf("%.5f", r2);
			System.out.print("\n");
		}
		
	}
}
