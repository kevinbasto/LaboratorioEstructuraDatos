/*
*	esta clase tiene realiza la conversión del infijo al postfijo
*
*/

import java.util.Scanner;

public class Procesador{

	//atributos de la clase main
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private static Nodo cabeza = new Nodo('\n');

	/*
	*  método main
	*----------------------------------------------------------
	*/
	public static void main(){
		menu();
	}

	private static void menu(){

	}

	/*
	*método utilizado para crear la pila de caracteres
	*----------------------------------------------------------
	*/
	private static void crearCadena(String cadenaOperacion){
		Scanner scanner = new Scanner(System.in);
		char cadenaCaracter[] = cadenaOperacion.toCharArray();

		for(int i=0; i<cadenaOperacion.length(); i++){
			
		}
	}

}