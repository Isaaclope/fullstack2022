import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hibernate_demo";
		String usuario = "root";
		String password = "";
		
		try {
			
			Estudiante estudiante =;
			session.beginTransaction();
			session.save(estudiante);
			
			
			System.out.println("Conectando a la base de datos:" + jdbcUrl);
			
			Connection con = DriverManager.getConnection(jdbcUrl, usuario, password);
			
			System.out.println("Conexi�n exitosa");
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
}
