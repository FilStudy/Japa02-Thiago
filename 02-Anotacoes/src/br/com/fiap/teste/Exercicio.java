package br.com.fiap.teste;

import br.com.fiap.anotacao.Tabela;
import br.com.fiap.bean.Animal;

public class Exercicio {

	public static void main(String[] args) {
		Animal a = new Animal();
		

		Tabela t = a.getClass().getAnnotation(Tabela.class);
		System.out.println("SELECT * FROM " + t.nome());
	}

}
