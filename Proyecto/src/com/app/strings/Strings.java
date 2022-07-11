package com.app.strings;

public class Strings {

	public static void main(String[] args) {
		String texto = "Esto es un texto";
		System.out.println(texto.length());
		
		String texto2 = "Esto es un texto";
		// devuelve el primer car�cter del String
		System.out.println(texto.charAt(0));
		// devuelve el tercer car�cter del String
		System.out.println(texto.charAt(2));
		// devuelve el �ltimo car�cter del String
		System.out.println(texto.charAt(texto.length() - 1));
		// error porque el String texto posee una longitud de 16 caracteres. Se genera un
        //excepci�n de tipo StringIndexOutOfBoundsException
		// System.out.println(texto.charAt(222));
		
		String texto3 = "Esto es un texto";
		// 3
		System.out.println(texto.indexOf('o'));
		// -1
		System.out.println(texto.indexOf('z'));
		// 5
		System.out.println(texto.indexOf("es"));
		// -1
		System.out.println(texto.indexOf("a"));
		// 15
		System.out.println(texto.indexOf('o', 6));
		// -1
		System.out.println(texto.indexOf("es", 6));
		
		String texto4 = "Esto es un texto";
		// 15
		System.out.println(texto.lastIndexOf('o'));
		// -1
		System.out.println(texto.lastIndexOf('z'));
		// 5
		System.out.println(texto.lastIndexOf("es"));
		// -1
		System.out.println(texto.lastIndexOf("a"));
		
		String texto5 = "Esto es un texto";
		// true
		System.out.println(texto.startsWith("Esto"));
		// false
		System.out.println(texto.startsWith("a"));
		
		String texto6 = "Esto es un texto";
		// true
		System.out.println(texto.endsWith("to"));
		// false
		System.out.println(texto.endsWith("a"));
		
		String texto7 = "";
		// true
		System.out.println(texto.isEmpty());
		
		String Texto1 = "hola";
		String Texto2 = "adi�s";
		// true
		System.out.println(Texto1.equals("hola"));
		// false
		System.out.println(texto2.equals("hola"));
		// false porque el primer car�cter se encuentra en may�sculas
		System.out.println(Texto1.equals("Hola"));
		
		String txto1 = "hola";
		String txto2 = "AdI�S";
		// true
		System.out.println(txto1.equalsIgnoreCase("hOlA"));
		// true
		System.out.println(txto2.equalsIgnoreCase("adi�s"));
		
		String Texto = "hola";
		// true
		System.out.println(texto.contains("ol"));
		// false
		System.out.println(texto.equals("al"));
		
	}

}
