package Cafetera;
/**
 * Clase funcionCafetera que recoge el objeto Cafetera y sus metodos
 * @author andre
 *
 */
public class funcionCafetera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafetera c = new Cafetera();
		
		c.agregarCafe(50);
		System.out.println(c.get_cantidadActual());
		c.servirTaza(20);
		System.out.println(c.get_cantidadActual());
		c.vaciarCafetera();
		System.out.println(c.get_cantidadActual());
		c.agregarCafe(1060);
		System.out.println(c.get_cantidadActual());
	}

}
