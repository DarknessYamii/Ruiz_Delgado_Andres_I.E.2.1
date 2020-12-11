package Vehiculo;
/**
 * Clase main del objeto Vehiculo
 * @author andre
 *@version V1.0
 */
public class funcionVehiculo {

	public static void main(String[] args) {
		Vehiculo v = new Vehiculo();
		/**
		 * Introduciendo la informacion que recogera el objeto
		 */
		v.setModelo("BMW");
		v.setPotencia(155.5);
		v.setcRuedas(false);
		/**
		 * Imprimiendo la informacion recogida por el objeto
		 */
		System.out.println("El modelo es: "+v.getModelo());
		System.out.println("La potencia es: "+v.getPotencia()+"CV");
		v.iscRuedas();
		System.out.println(v.getInformacion());
	}

}
