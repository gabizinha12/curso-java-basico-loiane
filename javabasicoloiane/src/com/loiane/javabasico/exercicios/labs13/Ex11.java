package com.loiane.javabasico.exercicios.labs13;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os números: ");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		double numero3 = sc.nextDouble();
		int produto = numero1 * 2 * numero2 / 2;
		double soma = (numero1 * 3) + numero3;
		double aoCubo = Math.pow(numero3, 3);
		System.out.printf("O produto dos números é %d", produto);
		System.out.printf(" A soma é %.0f", soma);
		System.out.printf(" O terceiro numero elevado ao cubo é %.0f", aoCubo);
		sc.close();
	}
}
