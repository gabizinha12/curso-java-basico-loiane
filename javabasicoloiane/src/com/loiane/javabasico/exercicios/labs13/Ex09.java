package com.loiane.javabasico.exercicios.labs13;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a temperatura em Fahreinheit: ");
		float tempFahrenheit = sc.nextFloat();
		float tempCelsius = (5 * (tempFahrenheit - 32) / 9);
		System.out.printf("A temperatura em Celsius é %f °C", tempCelsius);
		sc.close();
		
	}

}
