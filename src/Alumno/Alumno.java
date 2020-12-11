package Alumno;

import Asignatura.Asignatura;
/**
 * 
 * Objeto Alumno que hereda de Asignatura 
 * @author andre
 *
 */
public class Alumno extends Asignatura{
	/**
	 * Hereda super nombreasign y nota
	 * @param nombre
	 * @param edad
	 */
	private String nombre;
	private int edad;
	public Alumno(String nombreasign, int nota) {
		super(nombreasign, nota);
		this.nombre=nombre;
		this.edad=edad;
	}

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
	public String toString() {//Muestra en pantalla el nombre del alumno su edad, la asignatura cursada y su nota
		return "Nombre: "+nombre+", Edad:"+edad+", Asignatura cursada: "+nombreasign+", Nota: "+nota;
	}

}
