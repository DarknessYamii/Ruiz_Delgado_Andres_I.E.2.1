package Persona;
/**
 * Clase que contiene el objeto empleado y persona llamando a sus respectivos metodos
 * @author andre
 *
 */
public class funcionEmpleadoPersona {

	public static void main(String[] args) {
		Empleado e = new Empleado();
		Persona p = new Persona();
		
		p.setNombre("Andres");
		p.setEdad(15);
		System.out.println(p.toString());
		e.setSueldo(15);
		System.out.println(e.toString());

	}

}
