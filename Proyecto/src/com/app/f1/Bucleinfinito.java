package com.app.f1;
public class Bucleinfinito {

	public static void main(String[] args) {
   //Se generara una excepci�n por que en la sexta iteraci�n del bucle se realiza la operaci�n
   //matematica 5/0 (infinito)y ese valor no puede ser almacenado en una variable de tipo int.
   //Se arroja una excepci�n de tipo ArithmeticException y el programa se detiene en ese punto.  
    
		for(int i = -5; i < 5; i++) {
			int c = 5 / i;
			System.out.println(c);
		}
		/*
		Exception in thread "main" java.lang.ArithmeticException: / by zero
		at Main.main(Main.java:9)
		*/
		
		// trata de ejecutar el c�digo que se encuentra entre las llaves
		try {
			for(int i = -5; i < 5; i++) {
				int c = 5 / i;
				System.out.println(c);
			}
		}
		// captura la excepci�n de tipo ArithmeticException
		catch (ArithmeticException e) {
			System.out.println("Excepci�n arim�tica");
		}
		// captura cualquier otra excepci�n que pueda producirse
		catch (Exception e) {
			System.out.println("Otro error desconocido");
		}
		System.out.println("Programa finalizado");
	}
}
			
			
			
			
			
			
			
			