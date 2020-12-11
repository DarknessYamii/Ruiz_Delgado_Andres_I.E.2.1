package DVDCine;

import java.util.Scanner;
/**
 * Clase main del objeto DVDCine 
 * @author andre
 *@version V1.0
 */
public class pruebaDVDCine {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		/**
		 * Te muestra por pantalla la informacion necesaria a introducir y despues te pide que introduzcas
		 * la informacion necesaria
		 */
		System.out.println("Nombre de la pelicula");
		String nombre = sc.nextLine();
		System.out.println("Nombre del autor");
		String autor = sc.nextLine();
		System.out.println("Resumen");
		String resumen = sc.nextLine();
		System.out.println("Genero");
		String genero = sc.nextLine();
		System.out.println("Duracion");
		int duracion = sc.nextInt();
		/**
		 * Llamada a la clase objeto para utilizar sus respectivos metodos
		 */
		DVDCine cine = new DVDCine(nombre, autor, resumen, genero, duracion);
		System.out.println(cine.esThriller());
		System.out.println(cine.muestraDuracion()); 
		System.out.println(cine.tieneResumen());
		System.out.println(cine.muestraDVDCine());
	}

}
