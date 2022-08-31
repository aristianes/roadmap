package com.aristiane.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class MediaOne {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		leitor.useLocale(Locale.US);
		double a = leitor.nextDouble();
		double b = leitor.nextDouble();
		
		double media = ((3.5*a) + (7.5*b))/11;
		
		System.out.println(String.format("MEDIA = %.5f", media));
    }
		

	}

}
