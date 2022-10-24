package com.aristiane.beecrowd;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Media1040 {
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		double N1 = scanner.nextDouble();
		double N2 = scanner.nextDouble();
		double N3 = scanner.nextDouble();
		double N4 = scanner.nextDouble();
		
		double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) +(N4 * 1))/10;
		System.out.println(media);
		Locale locale = new Locale("en", "UK");
		String pattern = "###.#";

		DecimalFormat decimalFormat = (DecimalFormat) NumberFormat
				.getNumberInstance(locale);
		decimalFormat.applyPattern(pattern);
		System.out.println("Media: " + decimalFormat.format(media));

		double mediaFormat =  Double.parseDouble(decimalFormat.format(media));
		System.out.println(mediaFormat);
		
		if (mediaFormat >= 5) {
			System.out.println("Aluno aprovado.");
		}else {
			System.out.println("Aluno reprovado.");
		}
		
		
	}

}
