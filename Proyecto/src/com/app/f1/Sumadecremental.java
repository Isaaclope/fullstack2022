package com.app.f1;
public class Sumadecremental {

	public static void main(String[] args) {
		int num = 10;
		int resultado = 0;
		for(int i=num; i>0; i--) {
			resultado+=i; //resultado = resultado + i;
		}
		System.out.printf("El resultado de la suma decremental es: %d", resultado).println();
	}
}