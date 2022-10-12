package com.loiane.javabasico.exercicios.labs14;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		
		if( valor < 0) {
			System.out.println("O valor é negativo");
		} else {
			System.out.println("O valor é positivo");
		}

		sc.close();
	}

}
