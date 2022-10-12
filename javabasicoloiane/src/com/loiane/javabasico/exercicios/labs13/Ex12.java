package com.loiane.javabasico.exercicios.labs13;

import java.util.Locale;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);		
		System.out.print("Digite sua altura:  ");
		double altura = sc.nextDouble();
		double pesoIdeal = (72.7 * altura) - 58;
		System.out.printf("O seu peso ideal é :  %.2f", pesoIdeal);
		sc.close();
	}
}
