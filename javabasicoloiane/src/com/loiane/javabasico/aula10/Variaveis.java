package com.loiane.javabasico.aula10;

public class Variaveis {
	public static void main(String[] args) {
		
		// convenção Java
		int idade = 21;
		String nome= "Gabizinha";
		String nomeDoMeuCachorro = "Duke";
		String ano2014 = "2014";

		
		
		// aceito mas não utilizado
		int _idade;
		int $idade;
		
		// não é convenção Java
		
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		// má prática
		int a = 10;
		String  b = "Loiane";
		
	}

}
