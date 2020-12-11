package Marciano;
/**
 * Clase principal del objeto Marcianos
 * @author andre
 *
 */
public class Marte {

	public static void main(String[] args) {
		/**
		 * Inicializacion de 3 marcianos
		 */
		Marciano et1 = new Marciano("Andres");
		Marciano et2 = new Marciano("Marco");
		Marciano et3 = new Marciano("Javi");
		et2.muere();//Fallece marciano 2
		Marciano et4 = new Marciano("Lourdes"); //Nace uno nuevo
		et2.muere(); //Mostrara que ya esta muerto
		/**
		 * Muestra el estado de cada uno
		 */
		et1.estaVivo();
		et2.estaVivo();
		et3.estaVivo();
		et4.estaVivo();
		System.out.println(et1.cuentaMarcianos());
	}

}
