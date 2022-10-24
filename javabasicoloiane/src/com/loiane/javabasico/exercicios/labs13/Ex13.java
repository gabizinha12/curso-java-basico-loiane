package com.loiane.javabasico.exercicios.labs13;

import java.util.Locale;
import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite sua altura:  ");
		double altura = sc.nextDouble();
		System.out.println("Digite seu sexo:   ");
		String sexo = sc.next();
		System.out.println("Digite seu peso:  ");
		double peso = sc.nextDouble();

		double formula;		
		switch(sexo.charAt(0)) {
		case 'H':
			formula = (72.7 * altura) - 58;
		    System.out.printf("O seu peso ideal é : %.2f", formula);
		    if(peso > formula) {
				System.out.println(" Voce está acima do peso");
				
			} else if( peso < formula) {
				System.out.println(" Voce esta abaixo do peso");
			} else {
				System.out.println(" Voce esta dentro do peso");
			}
		break;
		case 'M':
			formula = (62.1 * altura) - 44.7;
		    System.out.printf("O seu peso ideal é : %.2f", formula);
		    if(peso > formula) {
				System.out.println(" Voce está acima do peso");
				
			} else if( peso < formula) {
				System.out.println(" Voce esta abaixo do peso");
			} else {
				System.out.println(" Voce esta dentro do peso");
			}
		break;
		default:
			System.out.println("Sexo inválido");
			break;	
		}
		
		sc.close();
		
	}

}
