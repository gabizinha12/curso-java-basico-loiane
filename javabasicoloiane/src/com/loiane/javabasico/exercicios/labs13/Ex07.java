package com.loiane.javabasico.exercicios.labs13;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o lado do quadrado: ");
		double lado = sc.nextInt();
		double area = lado * lado;
		double dobro = area * 2;
		System.out.printf("A area do quadrado é %f", area);
		System.out.printf("O dobro da area é %f", dobro);
		sc.close();
	}

}
