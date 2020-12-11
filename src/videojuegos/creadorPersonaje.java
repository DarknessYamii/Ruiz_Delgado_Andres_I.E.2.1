package videojuegos;
/**
 * Clase principal de los objetos Personajes Guerreros y Magos
 * @author andre
 *
 */
public class creadorPersonaje {

	public static void main(String[] args) {
		Personaje p = new Personaje("Adios",10);
		Guerreros g = new Guerreros("Adios", 10, "Hola");
		g.Combatir();
		g.Combatir();
		Magos m = new Magos("Andres","Ki",10);
		m.Encantar();
		m.Encantar();
		m.Alimentarse();
		m.Encantar();
		g.Alimentarse();
		g.Combatir();
	}

}
