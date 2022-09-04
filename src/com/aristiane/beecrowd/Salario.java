package com.aristiane.beecrowd;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
	
		/**
		 * Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
		 * o valor que recebe por hora e calcula o salário desse funcionário. 
		 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, 
representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada,
respectivamente.
		 */
		
		int funcionario = 0;
		int horas = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		funcionario = leitor.nextInt();
        horas = leitor.nextInt();
        
        double valorPorHora = leitor.nextDouble();
        double salario = horas * valorPorHora;
        
        System.out.println("NUMBER = " + funcionario);
        System.out.println(String.format("SALARY = U$ %.2f" , salario));
	}

}
