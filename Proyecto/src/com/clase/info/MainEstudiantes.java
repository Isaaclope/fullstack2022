package com.clase.info;

public class MainEstudiantes {

	public static void main(String[] args) {
		EjerciciosEstudiantes isaac = new EjerciciosEstudiantes();
		EjerciciosEstudiantes albert = new EjerciciosEstudiantes(3);
		EjerciciosEstudiantes laura = new EjerciciosEstudiantes(5,19);
		EjerciciosEstudiantes alison = new EjerciciosEstudiantes(5 , 25 , 696999999, 8 , 8 , 8.0);
		EjerciciosEstudiantes adrian = new EjerciciosEstudiantes(18);
		//Mostrar la id del estudiante albert solo si es visible, es decir, "public"
		//System.out.println(albert.id);
		System.out.println(isaac.getId()); //Muestra valor actual = 1
		isaac.setId(3);//Modificamos valor actual, asignando por argumento un 3
		System.out.println(isaac.getId());//Muestra valor actual = 3
		System.out.println(albert.getTelefono()); //Muestra valor 699999996
		albert.setTelefono(654321789);//Modificamos valor actual
		System.out.println(albert.getTelefono()); //Muestra valor 654321789
		System.out.println(isaac.getTelefono()); //Muestra valor 699999999
		System.out.println(laura.getId()); //Muestra valor actual
		laura.setId(5);//Modificamos valor actual, asignando por argumento
		System.out.println(alison.getId()); //Muestra valor actual
		alison.setId(2);//Modificamos valor actual, asignando por argumento
		System.out.println(adrian.getId()); //Muestra valor actual
		adrian.setId(18);//Modificamos valor actual, asignando por argumento
	}
}