/*
*	esta clase tiene realiza la conversión del infijo al postfijo
*
*/

import java.util.Scanner;

public class Procesador{

	//atributos de la clase main
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private static Nodo tope = new Nodo('\n');
	private static Nodo topePost;

	/*
	*  método main
	*----------------------------------------------------------
	*/
	public static void main(){
		menu();
	}

	/*
	* método menu
	*----------------------------------------------------------
	*tiene la función de imprimir el menu del sistema
	*para ordenar la estructura de datos
	*opciones implementadas:
	*añadir operacion
	*imprimir la pila
	*vacía pila
	*determinar si la pila está vacía
	*imprimir el resultado postfijo
	*salir
	*/
	private static void menu(){
		Scanner scanner = new Scanner(System.in);
		int selector;

		do{
			System.out.println("menu					\n");
			System.out.println("------------------------\n");
			System.out.println("1.-añadir la operacion  \n");
			System.out.println("2.-imprimir la pila     \n");
			System.out.println("3.-vaciar la pila       \n");
			System.out.println("4.-verificar pila       \n");
			System.out.println("5.-imprimir postfijo    \n");
			System.out.println("6.-salir				\n");
			System.out.println("------------------------\n");
			System.out.println("seleccion: ");
			selector = scanner.nextInt();

			switch(selector){
				//case 1: creación de una pila
				case 1:
					String cadena;
					clearScreen();
					System.out.println("introduce la operacion: ");
					cadena = scanner.nextLine();
					crearCadena(cadena);
					break;
				//case 2 impresion de la pila
				case 2:

					break;
				//case 3 vaciar la pila
				case 3:

					break;
				//case 4 verificar la pila
				case 4:

					break;
				//case 5 imprimir en el formato postfijo
				case 5:

					break;
				//case 6: salir
				case 6:

					return;
			}
		}while(selector != 6);
	}

	/*
	* Método crear postfijo
	*----------------------------------------------------------
	*este método crea la pila para crear la cadena postfija
	*/
	private static void crearPostfijo(){
		
	}

	/*
	* método que verifica la existencia de la pila
	*----------------------------------------------------------
	*/
	private static boolean verificaPila(){
		if(tope.isEmpty()){
			return true;
		}

		return false;
	}

	/*
	*metodo limpiarPila
	*----------------------------------------------------------
	*este método limpia la pila
	*/
	private static void limpiarPila(){
		topePost = null;
		tope = null;
	}


	/*
	*método utilizado para crear la pila de caracteres
	*----------------------------------------------------------
	*este método es utilizado para la creación de una pila de
	*caracteres con la cual se realizara la conversión a la
	* notación postfija
	*/
	private static void crearCadena(String cadenaOperacion){
		//variables del método para crear la cadena
		char cadenaCaracter[] = cadenaOperacion.toCharArray();
		Scanner scanner = new Scanner(System.in);
		Nodo auxiliar = new Nodo(cadenaCaracter[cadenaOperacion.length()-1]);
		tope.setSiguiente(auxiliar);

		for(int i=cadenaOperacion.length()-2; i<0; i--){
			auxiliar.setSiguiente(new Nodo(cadenaCaracter[i]));
			auxiliar = auxiliar.getSiguiente();
		}


	}


	/*
	* metodo clearscreen
	*----------------------------------------------------------
	*este método busca hacer ver la pantalla lo más limpio posible
	*
	*/
	private static void clearScreen(){
		for(int i=0; i<30; i++){
			System.out.println("\n");
		}
	}

	/*
	* metodo imprimirPila
	*----------------------------------------------------------
	*este método sirve para imprimir la pila
	*/
	private static void imprimirPila(){
		Nodo auxiliar = tope;
		while(auxiliar.getSiguiente() != null){
			System.out.println(auxiliar.getCaracter());
		}
	}

}