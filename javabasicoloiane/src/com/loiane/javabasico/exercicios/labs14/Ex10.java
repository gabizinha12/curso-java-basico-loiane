package com.loiane.javabasico.exercicios.labs14;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String turno = sc.next();
		char turnoEscolha = turno.charAt(0);
		
		switch(turnoEscolha) {
		case 'M':
			System.out.println("Bom Dia!");
			break;
		case 'V':
			System.out.println("Boa Tarde!");
			break;
		case 'N':
			System.out.println("Boa Noite!");
			break;
		 default:
		  System.out.println("Valor Inválido");	
		  break;
		}
		sc.close();

	}

}
