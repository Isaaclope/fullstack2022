package com.app.strings;

public class ArrayEjercicios {

	public static void main(String[] args) {
	//Ejercicio: escribe un programa que genere un array de 6 valores de tipo int y sean
	//mostrados en pantalla utilizando un bucle for.
		int numeros [] = {2,5,3,8,5,7};
		for(int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
			}
		Object datos[] = { "a", 'a', true, 55, 2.3, 33 };
		System.out.println(datos[3] instanceof Integer);
		

	}

}
