/*
*	Clase: Ordenador
*--------------------------------------------------------------
*	Esta es la única clase del proyecto y tiene la función de
* de almacenar un monton de información aleatoria y ordenarla
* por los múltiples métodos de ordenamiento.
*
*/

import java.util.Scanner;

public class Ordenador{
	
	//atributos de la clase
	private static float[]  vector;
	private static int[]	pasos;
	private static int[][]  tablaRes = new int[10][4];
	private static Scanner scanner = new Scanner(System.in);

	/*
	*	Método: main
	*----------------------------------------------------------
	* No tiene mayor función el método main que iniciar al menu
	*/
	public static void main(){
		menu();
	}	//fin del main


	/*
	*	Método: menu
	*----------------------------------------------------------
	* Éste método tiene la función de servir de menu para la
	* selección de las múltiples opciones del programa
	*/
	public static void menu(){

		int selector;
		boolean salir = false;

		do{
			imprimeOpciones();
			System.out.println("seleccione una opcion: ");
			selector = scanner.nextInt();

			switch(selector){
				case 1:
					crearVector();
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

					break;
				case 6:

					break;
			}

		}while(salir == false); //fin del ciclo do while

	}//fin del ciclo salir

	/*
	*	Método: imprimeOpciones
	*----------------------------------------------------------
	* Tiene la función de imprimir las opciones del sistema
	* hecho así para aumentar la legibilidad del método menu
	*/
	private static void imprimeOpciones(){
		System.out.println("	Sistema de ordenamiento del vector		\n");
		System.out.println("--------------------------------------------\n");
		System.out.println("1.-crear vector de una longitud n   		\n");
		System.out.println("2.-ordenar por bubble sort  				\n");
		System.out.println("3.-ordenar por selection sort 				\n");
		System.out.println("4.-ordenar por inserction sort 				\n");
		System.out.println("5.-ordenar por inserction Sort 				\n");
		System.out.println("6.-salir del programa						\n");
		System.out.println("--------------------------------------------\n");

	} //fin de imprimeOpciones


	/**/
	private static void crearVector(){
		int longitud;
		
	}


}