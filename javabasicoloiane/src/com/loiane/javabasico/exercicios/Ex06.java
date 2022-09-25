package com.loiane.javabasico.exercicios;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double  PI = Math.PI;
		System.out.print("Digite o raio da circunferência:  ");
		float raio = sc.nextFloat();
		float area = (float) (PI * (raio * raio));
		System.out.printf("A area do círculo é : %.3f", area);
		sc.close();
		
		
	}
}
