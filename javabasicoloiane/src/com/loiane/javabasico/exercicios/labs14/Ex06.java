package com.loiane.javabasico.exercicios.labs14;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite três números:  ");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.printf("O número maior é %d", numero1);
		} else if(numero2 > numero1 && numero2 > numero3) {
			System.out.printf("O número maior é %d", numero2);
		} else {
			System.out.printf("O número maior é %d", numero3);
		}
		sc.close();

	}

}
