package com.app.Banco;
import java.util.*;
public class EjerciciosMain2 {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		int numero =0;
		
		while (numero !=6) {
			System.out.println("Introduce un n?mero por pantalla: ");
			numero =keyboard.nextInt();
		}
		System.out.println("El numero es correcto, el 6");
		keyboard.close();

	}

}
