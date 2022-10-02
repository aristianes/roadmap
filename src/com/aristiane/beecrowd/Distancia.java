package com.aristiane.beecrowd;

import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        int km = leitor.nextInt();
        
       int minutos = (60 * km)/30;
       
       System.out.println(minutos + " minutos");
        		 

	}

}
