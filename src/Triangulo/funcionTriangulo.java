package Triangulo;
/**
 * Clase principal del objeto Triangulo
 * @author andre
 *
 */
public class funcionTriangulo {

	public static void main(String[] args) {
		Triangulo a =new Triangulo(5, 5, 5); //Inicializa el triangulo
		Triangulo b =new Triangulo(5, 7, 1);
		Triangulo c = new Triangulo(1,7,5);
		System.out.println(Triangulo.compareTo_Triangulos(a,b)); //Compara los triangulos a y b
		Triangulo v[] = {a,b,c}; //Le digo cuan grande es el array y los triangulo que va a tener
		System.out.println(Triangulo.compareTo_VTriangulos(v)); //Compara los 3 triangulos
		System.out.println(a.tipo_Triangulo());//Me dice cuantos lados tiene iguales A
	}

}
