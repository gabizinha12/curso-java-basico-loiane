package com.loiane.javabasico.exercicios;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor em metros: ");
		double valorEmMetros = sc.nextDouble();
		double valorEmCentimetros = valorEmMetros * 100;
		System.out.printf("O valor %.0f em metros equivale a %.3f em cm", valorEmMetros,valorEmCentimetros);
		sc.close();;
	}

}
