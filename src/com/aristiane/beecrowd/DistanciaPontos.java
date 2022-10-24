package com.aristiane.beecrowd;

import java.util.Scanner;

public class DistanciaPontos {

	/*
	 * Leia os quatro valores correspondentes aos eixos x e y de dois pontos
	 * quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a dist�ncia entre
	 * eles, mostrando 4 casas decimais ap�s a v�rgula, segundo a f�rmula:
	 */

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		double x1 = leitor.nextDouble();
		double y1 = leitor.nextDouble();
		double x2 = leitor.nextDouble();
		double y2 = leitor.nextDouble();

		double calculo = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		double sqrt = Math.sqrt(calculo);
		System.out.println(String.format("%.4f", (sqrt)));

	}

}
