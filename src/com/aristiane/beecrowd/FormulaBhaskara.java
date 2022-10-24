package com.aristiane.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class FormulaBhaskara {
	/*Leia 3 valores de ponto flutuante e efetue o c�lculo das ra�zes da equa��o de Bhaskara. 
	 * Se n�o for poss�vel calcular as ra�zes, mostre a mensagem correspondente �Impossivel calcular�,
	 *  caso haja uma divis�o por 0 ou raiz de numero negativo.
	 *  Entrada
		Leia tr�s valores de ponto flutuante (double) A, B e C.
		Sa�da
		Se n�o houver possibilidade de calcular as ra�zes, apresente a mensagem "Impossivel calcular". 
Caso contr�rio, imprima o resultado das ra�zes com 5 d�gitos ap�s o ponto, 
com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha ap�s cada mensagem.
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
