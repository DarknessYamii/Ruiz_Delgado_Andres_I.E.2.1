package Asignatura;
/**
 * Objeto Asignatura 
 * @author andre
 *
 */
public class Asignatura {
/**
 * @param nombre
 * @param nota
 */
	protected String nombreasign;
	protected int nota;
	/**
	 * Recoge los datos de una asignatura y los inicia
	 * @param nombre
	 * @param nota
	 */
	public Asignatura(String nombreasign, int nota) {
		this.nombreasign=nombreasign;
		this.nota=nota;
	}

	public String getNombre() {//Permite mostrar el nombre de la asignatura
		return nombreasign;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {//Modifica la nota
		this.nota = nota;
	}
	
	public void comprobarAprobado() {//Comprueba si estas aprobado o no
		if(nota>10 || nota<0) {
			System.out.println("Nota incorrecta");
		}else if(nota>=5) {
			System.out.println("Usted esta aprobado con un "+nota);
		}else {
			System.out.println("Usted ha suspendido con un "+nota);
		}
	}
}
