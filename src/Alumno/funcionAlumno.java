package Alumno;
/**
 * Clase main de Alumno y Asignatura 
 * @author andre
 *
 */
public class funcionAlumno {

	public static void main(String[] args) {
		Alumno a = new Alumno("Programacion", 0); //Inicializacion de la asignatura y de la nota de la asignatura
		Alumno a1 = new Alumno("Lengua", 2);
		Alumno a2 = new Alumno("Fisica", 9);
		a.setEdad(19);//Añade la edad del alumno
		a.setNombre("Angel");//Añade el nombre del alumno
		System.out.println(a.toString());
		a.comprobarAprobado();//Muestra en pantalla si esta aprobado o no
		a1.setEdad(17);
		a1.setNombre("Manuel");
		System.out.println(a1.toString());
		a1.comprobarAprobado();
		a2.setEdad(16);
		a2.setNombre("Irache");
		System.out.println(a2.toString());
		a2.comprobarAprobado();
	}

}
