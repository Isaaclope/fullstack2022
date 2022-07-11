package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectaconBanco {

	public static void main(String[] args) {
		//"jdbc:mysql://localhost:3306/banco", "banco", "banco"
		try {
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
			System.out.println("Esta Conectado");
			
		}
		
		catch(Exception e) {
			System.out.println("No esta conectado");
			e.getStackTrace();

		}
	}

}
