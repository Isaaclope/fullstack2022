package Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	

	public static void main(String[] args) {

		// abre el contexto a partir del archivo de configuración
		//Obtiene los BEANS del archivo XML
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// abre el contexto a partir del archivo de configuración
		//Obtiene los BEANS de las anotaciones
		AnnotationConfigApplicationContext contextconfig = new
				AnnotationConfigApplicationContext(Configuracion.class);
		
		// obtener el bean mediante Inyección de dependencias
		profesor profesor = context.getBean("miprofesorinformatica", 
												profesor.class);
		profesor profesor1 = context.getBean("miprofesorinformatica", 
				profesor.class);
		System.out.println(profesor.getExperiencia());
		
		
		//Inyección de VALORES LITERALES
		System.out.println(profesor.getEmail());
		System.out.println(profesor.getEquipo());
		
		// obtener el bean mediante Inyección de dependencias
		profesor profesor2 = context.getBean("miprofesormates", 
												profesor.class);
		System.out.println(profesor2.getExperiencia());
		
		//Valores en properties
		System.out.println(profesor2.getEmail());
		System.out.println(profesor2.getEquipo());
		
		// obtener el bean mediante Inyección de dependencias
		profesor profesor3 = contextconfig.getBean("miprofesororientación", 
												profesor.class);
		System.out.println(profesor3.getExperiencia());
		
		
		
		
	
		
		context.close();
		contextconfig.close();
		
		
	}

}