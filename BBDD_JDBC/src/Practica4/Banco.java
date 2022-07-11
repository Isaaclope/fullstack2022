package Practica4;

import java.sql.*;

public class Banco {

	public static void main(String[] args) {
		//"jdbc:mysql://localhost:3306/banco", "banco", ""
		try {
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
			System.out.println("Esta Conectado");
			Statement miStatement = miConexion.createStatement();
			System.out.println("Creado Statement");
			Statement instruccion = miConexion.createStatement();
			String query = "SELECT * FROM gestor";
			ResultSet resultados1 = instruccion.executeQuery(query);
			System.out.println("Listado de gestores (con executeQuery): ");
			while (resultados1.next()) {
				System.out.println("Gestor " + resultados1.getInt("id"));
				System.out.println("Usuario: " + resultados1.getString("usuario"));
				System.out.println("Password: " + resultados1.getString("password"));
				System.out.println("Correo: " + resultados1.getString("correo"));
				System.out.println("...");
				}
		
			
			System.out.println("Recorrido de la info BD");
			
			
		}
		
		catch(Exception e) {
			System.out.println("No esta conectado");
			e.getStackTrace();

		}
	}

}
