package Alimento;
/**
 * Clase principal del objeto Alimento
 * @author andre
 *
 */
public class funcionAlimento {

	public static void main(String[] args) {
		/**
		 * El false sera ignorado mientras los lipidos 1� constructor sea inferior a 20 y el 4� constructor su respuesta sea B 
		 */
		Alimento a = new Alimento(11, 21, 10, "B","A", false);
		a.setNombre("Carne con tomate");
		System.out.println(a.toString());
		a.esDietitico();
	}

}
