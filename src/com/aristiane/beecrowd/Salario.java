package com.aristiane.beecrowd;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
	
		/**
		 * Escreva um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, 
		 * o valor que recebe por hora e calcula o sal�rio desse funcion�rio. 
		 * A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.

Entrada
O arquivo de entrada cont�m 2 n�meros inteiros e 1 n�mero com duas casas decimais, 
representando o n�mero, quantidade de horas trabalhadas e o valor que o funcion�rio recebe por hora trabalhada,
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
