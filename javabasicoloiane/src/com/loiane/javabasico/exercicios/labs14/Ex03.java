package com.loiane.javabasico.exercicios.labs14;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra = sc.next();
		char sexo = palavra.charAt(0);
		switch (sexo) {
		case 'F':
			System.out.println("Feminino");
			break;
		case 'M':
			System.out.println("Masculino");
			break;
		default:
			System.out.println("Sexo inválido");
		}
		sc.close();
	}

}
