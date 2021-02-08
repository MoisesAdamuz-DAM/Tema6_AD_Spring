package es.studium.beans.academia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*
		 * Abrimos el contenedor de IoC indicando la ruta exacta de donde se encuentra
		 * el fichero
		 * 
		 * beans.xml
		 */

		// ApplicationContext appContext = new
		// ClassPathXmlApplicationContext("es/studium/xml/beans.xml");

		ApplicationContext appContext = new ClassPathXmlApplicationContext("es/studium/xml/beans_constructor.xml");

		/* Obtenemos un bean Asignaturas y lo imprimo por pantalla */

		/*
		 * En este caso imprime los valores de los atributos que le damos en el fichero
		 * beans.xml
		 */

		Asignaturas a1 = (Asignaturas) appContext.getBean("Asignatura");
		//Obtenemso el valor de las notas, la cual hemos definido en el bean
		double not = a1.getNotas();


		// Nombres
		a1.setNombre("Inglés B1");
		a1.setNombre("Inglés B2");
		a1.setNombre("Francés B1");
		a1.setNombre("Francés A2");

		// Horas
		a1.setHoras(3);
		a1.setHoras(5);
		a1.setHoras(6);
		a1.setHoras(8);

		// Notas
		a1.setNotas(7);
		a1.setNotas(6);
		a1.setNotas(5);
		a1.setNotas(9);
		a1.setNotas(8.5);

		// Código
		a1.setCodigo(1111);
		a1.setCodigo(2222);
		a1.setCodigo(3333);
		a1.setCodigo(4444);
		
		

		/* Obtenemos dos beans Alumnos y lo añadimos a una lista */

		/*
		 * En este caso imprie los valosres de los atributos que le asignamos con los
		 * métodos set
		 */

		Alumnos al1 = (Alumnos) appContext.getBean("Alumno");
		//Obtenemso el nombre del alumno definido en el bean
		String n = al1.getNombre();
		//Obtenemso la dirección del alumno definido en el bean
		String d = al1.getDireccion();
		/* Mostramos la dirección del alumno */
	    System.out.println("La dirección del centro de "+ n + " es "+ d);
        
		//Nombre
		al1.setNombre("Ana Abel");
		al1.setNombre("Benito Bueno");
		String nom = al1.getNombre();
		System.out.println("La nota que ha sacado "+ nom + " ha sido un "+not);
		al1.setNombre("Carmen Cano");
		al1.setNombre("Esteban Escalera");
		al1.setNombre("Francisco Farfán");
        
		//Dirección
		al1.setDireccion("Paseo de América, 15");
		al1.setDireccion("Reyes Católicos, 16");
		al1.setDireccion("Reyes Católicos, 2");
		al1.setDireccion("Isabel la Católica, 28");
		al1.setDireccion("Cristóbal Colón, s/n");

        //List
		List<Alumnos> alumnos = new ArrayList<Alumnos>();
		
		//Dirección
		al1.setMatricula(15);
		al1.setMatricula(24);
		al1.setMatricula(33);
		al1.setMatricula(42);
		al1.setMatricula(51);
		
		/* la lista de Alumnos */

		System.out.println(alumnos);

		/**/
       //CENTROS
		Centros c1 = (Centros) appContext.getBean("Centro");
		//Nombre
		c1.setNombre("Escuela de Inglés");
		//Dirección
		c1.setDireccion("Reyes Católicos, 14");
		//Codigo
		c1.setCodigo(111);
		//Nombre
		String ce = c1.getNombre();
		//Dirección
		String di = c1.getDireccion();
		System.out.println("La dirección del centro "+ ce + " es "+ di );
		
		
	    c1.setNombre("Escuela de Francés");
	    c1.setDireccion("Cristobal Colón, 92");
	    c1.setCodigo(222);
	    String ce2 = c1.getNombre();
	    String di2 = c1.getDireccion();
	    System.out.println("La dirección del centro "+ ce2 + " es "+ di2);
		

		((ConfigurableApplicationContext) appContext).close();
		
	

	}

}
