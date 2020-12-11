package Triangulo;

import java.util.Arrays;
/**
 * Objeto triangulo
 * @author andre
 *
 */
public class Triangulo {
/**
 * @param long_lado1
 * @param long_lado2
 * @param long_lado3
 */
	private double long_lado1;
	private double long_lado2;
	private double long_lado3;
	
	public Triangulo(double long_lado1,double long_lado2,double long_lado3) { //Constructor que imicializa los 3 lados de un triangulo
		this.long_lado1 = long_lado1;
		this.long_lado2 = long_lado2;
		this.long_lado3 = long_lado3;
	}
	public static boolean compareTo_Triangulos(Triangulo a, Triangulo b) { //Compara un triangulo con otro
	
		double[] ladosA = {a.long_lado1, a.long_lado2, a.long_lado3};
		double[] ladosB = {b.long_lado1, b.long_lado2, b.long_lado3}; //Guarda los lados del triangulo en un array
		
		Arrays.sort(ladosA); //Ordena los lados del triangulo introducidos
		Arrays.sort(ladosB);
		return Arrays.equals(ladosA, ladosB); //Compara los lados
		
	}
	
	public static boolean compareTo_VTriangulos(Triangulo v[]) { //Recoge una cantidad de Triangulos introducidos y los compara
		for(int i=1;i < v.length;i++) { //Recorre desde el primer triangulo introducido hasta el ultimo
			if(!Triangulo.compareTo_Triangulos(v[0], v[i])) { //Compara si el primer triangulo es igual o diferente a los demas introducidos, ya que si el primer es diferente a otro significa que el 2 tambien lo es
				return false;
			}
			
		}
		return true;
	}
	
	public int tipo_Triangulo() { //Compara los lados de un triangulo para saber si son o (1) todos iguales,(2) 2 iguales 1 dif o(3) todos diff
		if(long_lado1 == long_lado2 && long_lado1==long_lado3) {
			return 1;
		} else if ((long_lado1 == long_lado2 || long_lado1 == long_lado3 || long_lado2 == long_lado3)
				&& (long_lado1!= long_lado2 || long_lado1!=long_lado3 || long_lado2!= long_lado3)) {
			return 2;
		}else {
			return 3;
		}
	}
}
