package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.bean.Animal;

public class Teste {

	public static void main(String[] args) {
		// intanciar um animal
		Animal animal = new Animal();

		// api reflection: recupera toda a estrutura da claase
		// exibe o nome da classe

		System.out.println(animal.getClass().getSimpleName());

		// recuperar os metodos da classe animal
		Method[] metodos = animal.getClass().getDeclaredMethods();
		for (Method m : metodos) {
			System.out.println(m.getName());

		}
		// recuperar os atributos da classe animal
		Field[] atributos = animal.getClass().getDeclaredFields();

		for (Field f : atributos) {
			System.out.println("Nome: " + f.getName());
			// recuperar a anotação coluna
			Coluna a = f.getAnnotation(Coluna.class);
			System.out.println("Anotação: " + a.nullable());
		}
		
		
	}

}
