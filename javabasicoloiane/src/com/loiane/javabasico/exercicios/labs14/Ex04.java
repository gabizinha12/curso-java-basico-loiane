package com.loiane.javabasico.exercicios.labs14;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letra = sc.next();
		char caractere = letra.charAt(0);

		switch (caractere) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("É vogal");
			break;
		default:
			System.out.println("é consoante");
			break;
		}
		sc.close();
	}

}
