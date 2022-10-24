package com.aristiane.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int codigo = 0;
		int quantidade = 0;
		double preco = 0;
		double total = 0;

		codigo = scanner.nextInt();
		quantidade = scanner.nextInt();

		if (codigo == 1) {
			preco = 4.00;
		} else if (codigo == 2) {
			preco = 4.50;
		} else if (codigo == 3) {
			preco = 5.00;
		} else if (codigo == 4) {
			preco = 2.00;
		} else if (codigo == 5){
			preco = 1.50;
		} else{
			System.out.println("Item não encontrado ");
		}

		total = quantidade * preco;

		
		System.out.println(String.format("Total: R$ %.2f", total).replace(',', '.'));

	}

}
