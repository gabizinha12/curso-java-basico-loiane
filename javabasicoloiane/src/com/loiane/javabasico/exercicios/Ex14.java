package com.loiane.javabasico.exercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o quilo do peixe");
		double quilo = sc.nextDouble();
		double limite = 50;
		double multa = 4.00;
		if(quilo > limite) {
			multa *= quilo;
			System.out.printf("João terá que pagar %.2f ", multa);
		} else {
			multa = 0.00;
			System.out.printf("João  terá que pagar %.2f", multa);
		}
		sc.close();
	}
}
