package com.loiane.javabasico.exercicios.labs14;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O primeiro número é o maior " + numero1);
		} else {
			System.out.println("O segundo número é o maior " + numero2);
		}
		
		sc.close();
	}

}
