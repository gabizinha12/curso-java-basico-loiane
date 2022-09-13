package com.loiane.javabasico.aula07;

import java.util.Scanner;

public class Supermercado {
	public static void main(String[] args) {
		String[] frutasPromocao = { "banana", "maçã", "abacaxi", "melão", "mamão" };
		System.out.println("Qual fruta você deseja comprar hoje?");
		Scanner sc = new Scanner(System.in);
		String escolhaFruta = sc.nextLine();

		switch (escolhaFruta) {
		case "maçã":
		case "abacaxi":
		case "melão":
		case "mamão":
		case "banana":
			for(String frutas : frutasPromocao) {
				frutas.contains(escolhaFruta);
			}
            System.out.println("Ótima escolha!Essa fruta está em promoção hoje.");
			break;
		case "default":
			System.out.println("Fruta inválida");
			break;
            
       
		}
		sc.close();
	}

}
