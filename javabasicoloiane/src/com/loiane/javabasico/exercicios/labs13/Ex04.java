package com.loiane.javabasico.exercicios.labs13;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float nota1 = sc.nextFloat();
		float nota2 = sc.nextFloat();
		float nota3 = sc.nextFloat();
		float nota4 = sc.nextFloat();
		float media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("A média foi: " + media);
		sc.close();
	}
}
