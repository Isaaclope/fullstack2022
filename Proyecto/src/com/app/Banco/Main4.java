package com.app.Banco;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		/* Ejercicio proyecto (Main4): reutiliza el programa desarrollado para mostrar los mensajes
		(Gestores, Clientes, Transferencias, Mensajes, Pr?stamos) en m?todos (un m?todo por
		cada mensaje).
		*/
		Scanner keyboard= new Scanner(System.in);
		int numero =0;
		System.out.println("---\n"
				+ "1. Gestores\r\n"
				+ "2. Clientes\r\n"
				+ "3. Transferencias\r\n"
				+ "4. Mensajes\r\n"
				+ "5. Pr?stamos\r\n"
				+ "6. Salir\r\n");
		while (numero !=6) {
			System.out.println("Introduzca un n?mero: ");
			numero =keyboard.nextInt();
			if (numero == 1) {
				//Invocaci?n del m?todo que imprime "1--> Gestores"
				Main4.mensajeGestores1();
			} else if (numero == 2) {
				//Invocaci?n del m?todo que imprime "2--> Clientes"
				Main4.mensajeClientes2();
			} else if (numero == 3) {
				//Invocaci?n del m?todo que imprime "3--> Transferencias"
				Main4.mensajeTransferencias3();
			} else if (numero == 4) {
				//Invocaci?n del m?todo que imprime "4--> Mensajes"
				Main4.mensajeMensajes4();
			} else if (numero == 5) {
				//Invocaci?n del m?todo que imprime "5--> Prestamos"
				Main4.mensajePrestamos5();
			} else {
				System.out.println("La opci?n no esta en el sistema");
			}
		}
		System.out.println("6--> Salir");
		keyboard.close();

	}
	private static void mensajePrestamos5() {
		System.out.println("5--> Prestamos");
	}
	private static void mensajeMensajes4() {
		System.out.println("4--> Mensajes");
	}
	private static void mensajeTransferencias3() {
		System.out.println("3--> Transferencias");
	}
	private static void mensajeClientes2() {
		System.out.println("2--> Clientes");
	}
	public static void mensajeGestores1() {
		System.out.println("1--> Gestores");
	}

}