package com.aristiane.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus {

	public static void main(String[] args) {
		
		String nome = "";
		double salario = 0;
		double vendas = 0;
		double total = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		leitor.useLocale(Locale.US);
		nome = leitor.next();
		salario = leitor.nextDouble();
		vendas = leitor.nextDouble();
		
		total = salario + vendas * 0.15;
		
		System.out.println(String.format("TOTAL = R$ %.2f" ,total));
	
	}

}
