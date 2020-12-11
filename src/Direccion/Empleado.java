package Direccion;
/**
 * Objeto Empleado el cual se vincula con el objeto direccion y esta clase Empleado solo tendra como atributos nombre, salario y direccion
 * @author andre
 *
 */
public class Empleado {
/**
 * @param nombre
 * @param salario
 * @param direccion
 */
	private String nombre;
	private int salario;
	private Direccion direccion;
	
	public Empleado() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	/**
	 * Retorna el nombre y salario del empleado y llama al objeto direccion el cual muestra la calle, piso , numero y ciudad
	 * @return
	 */
	public String toString() {
		return "Nombre: "+nombre+", Salario: "+salario+"$\nDireccion:"+direccion;
	}
}
