package Persona;
/**
 * Objeto Persona con sus respectivos metodos
 * @author andre
 *
 */
public class Persona {
/**
 * @param nombre
 * @param edad
 */
	private String nombre;
	private int edad;
	

	public Persona() {
		this.nombre=nombre;
		this.edad=edad;
	}
	public String toString() { //Imprime la informacion de persona
		return "El nombre es "+nombre+" y tiene "+edad+" años";
	}
/**
 * Recoge nombre y edad y ademas lo visualiza en pantalla
 * @return
 */
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
}
