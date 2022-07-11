package com.app.strings;

public class Palindromo {

	public static void main(String[] args) {
		String palin = "ala";
		String palinReverse="";
		int indiceRecorre = palin.length()-1; //8
		System.out.println(indiceRecorre);
		char caracter=palin.charAt(indiceRecorre); //a
		System.out.println(caracter);
		for(int i=indiceRecorre;i>=0;i--) {
			palinReverse=palinReverse.concat(palin.valueOf(caracter));
			//System.out.println(caracter);
			//System.out.println(palinReverse);
			//System.out.println(indiceRecorre);
			indiceRecorre--;
			if(indiceRecorre>=0){
				caracter=palin.charAt(indiceRecorre);
			}
		
		}
		
		System.out.println(palinReverse);
		if(palin.equals(palinReverse)) {
			System.out.println("Es un palindromo");
		}
		else {
			System.out.println("No es un palindromo");
		}
		

	}

}

