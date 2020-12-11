package Persona;
/**
 * Objeto Empleado que hereada del objeto persona
 * @author andre
 *
 */
public class Empleado extends Persona {
	/**
	 * @param sueldo
	 */
	private int sueldo;
	/**
	 * Recoge y muestra por pantalla el sueldo
	 * @return
	 */
	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public Empleado() {
	this.sueldo=sueldo;
	}

	@Override
	public String toString() {//Muestra en pantalla el sueldo
		return "El sueldo es de "+sueldo+"$";
	}
}
