package com.loiane.javabasico.exercicios.labs14;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		double reajuste = 0, salarioNovo = 0;
		double aumento = 0;
		
		if(salario <= 280) {
			reajuste = 0.20f * salario;
			aumento = salario * 0.20f;
			System.out.println("O percentual de aumento no seu salário é de 20%");
		} else if(salario > 280 && salario <= 700) {
			reajuste = 0.15f * salario;
			aumento = salario * 0.15f;
			System.out.println("O percentual de aumento no seu salário é de 15%");
		} else if(salario > 700 && salario <= 1500) {
			reajuste = 0.10f * salario;
			aumento = 0.10f * salario;
			System.out.println("O percentual de aumento no seu salário é de 10%");
		} else if(salario > 1500) {
			reajuste = 0.05f * salario;
			aumento = 0.05f * salario;			
			System.out.println("O percentual de aumento no seu salário é de 5%");

		}
		
		salarioNovo = salario + reajuste;
		
		System.out.printf("\nSalário atual: R$  %.2f", salario);
		System.out.printf("\nSalário novo: R$  %.2f", salarioNovo);
		System.out.printf("\nO seu aumento foi de:  %.2f", aumento);
		sc.close();

	}

}
