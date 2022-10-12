package com.loiane.javabasico.exercicios.labs14;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double media = (nota1+nota2)/2;
		
	if(media == 10) {
		System.out.println("Aprovado com distinção");
	} else if(media >= 7) {
		System.out.println("Aprovado");
	} else {
		System.out.println("Reprovado");
	}
		sc.close();

	}

}
