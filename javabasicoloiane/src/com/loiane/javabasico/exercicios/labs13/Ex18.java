package com.loiane.javabasico.exercicios.labs13;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do arquivo: ");
		double tamanhoArquivo = sc.nextDouble();
		System.out.println("Digite a velocidade da internet:  ");
		double velocidadeInternet = sc.nextDouble();
		double velocidadeDownload = tamanhoArquivo / velocidadeInternet;
		System.out.println("Tempo de download: " + velocidadeDownload);
		sc.close();

	}

}
