package com.loiane.javabasico.exercicios.labs13;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a temperatura em Celsius:  ");
		float tempCelsius = sc.nextFloat();
		float tempFahreinheit = (float) ((tempCelsius * 1.8) + 32);
		System.out.printf("A temperatura em fahreinheit é %.0f °F", tempFahreinheit);
		sc.close();
	}

}
