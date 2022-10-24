package com.aristiane.beecrowd;

import java.util.Scanner;

public class GastoCombustivel {

	/*
	 * Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L. 
	 * Para isso, ele gostaria que você o auxiliasse através de um simples programa. Para efetuar o cálculo, 
	 * deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). 
	 * Assim, pode-se obter distância percorrida e, 
	 * em seguida, calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.
	 */
	public static void main(String[] args) {
	
	
		Scanner leitor = new Scanner(System.in);
        int tempo = leitor.nextInt();
        int velocidade = leitor.nextInt();
        double kilometros = tempo * velocidade;
        double media = kilometros / 12;
        System.out.println(String.format("%.3f", media));

	}

}
