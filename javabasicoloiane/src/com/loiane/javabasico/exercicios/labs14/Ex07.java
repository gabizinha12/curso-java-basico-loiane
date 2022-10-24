package com.loiane.javabasico.exercicios.labs14;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Digite três números: ");
	int numero1 = sc.nextInt();
	int numero2 = sc.nextInt();
	int numero3 = sc.nextInt();
	int menor;
	int maior;
	maior = numero1;
	
	if(numero2 > numero1 && numero2  > numero3) {
		maior = numero2;
	} if(numero3 > numero1 && numero3 > numero2) {
		maior = numero3;
	}
	
	menor = numero1;
	if(numero2 < numero3 && numero2 < numero1) {
		menor = numero2;
	} if(numero3 < numero2 && numero3 < numero1) {
		menor = numero3;
	}
	
	sc.close();
	System.out.printf("O menor número é : %d \n", menor);
	System.out.printf("O maior número é: %d \n", maior);

	}
}
