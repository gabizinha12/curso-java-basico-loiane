package com.loiane.javabasico.aula19;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um número");
		int num = sc.nextInt();
		
		System.out.println("Entre com um limite");
		int max = sc.nextInt();
		
		for(int i = num; i <= max; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
				break;
			}
		}

	}

}
