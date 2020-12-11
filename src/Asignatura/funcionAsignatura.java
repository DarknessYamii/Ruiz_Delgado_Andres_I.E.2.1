package Asignatura;
/**
 * Funciones del objeto Asignatura
 * @author andre
 *
 */
public class funcionAsignatura {

	public static void main(String[] args) {
		Asignatura a = new Asignatura("Matematicas", 5);//Inicializa el nombre y la nota de la asign
		a.comprobarAprobado();//Comprueba si esta aprobado o no
		a.setNota(8);//Modifica la nota
		a.comprobarAprobado();
		a.getNombre();//Muestra el nombre
	}

}
