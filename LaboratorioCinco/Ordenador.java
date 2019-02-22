/*
*	Clase: Ordenador
*--------------------------------------------------------------
*	Esta es la única clase del proyecto y tiene la función de
* de almacenar un monton de información aleatoria y ordenarla
* por los múltiples métodos de ordenamiento.
*
*/

public class Ordenador{
	
	//atributos de la clase
	private static float[] vector;

	/*
	*	Método: main
	*----------------------------------------------------------
	* No tiene mayor función el método main que iniciar al menu
	*/
	public static void main(){
		menu();
	}


	/*
	*	Método: menu
	*----------------------------------------------------------
	* Éste método tiene la función de servir de menu para la
	* selección de las múltiples opciones del programa
	*/
	public static void menu(){

		int selector;
		boolean salir;

		do{
			imprimeOpciones();

		}while(salir == false);
	}

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

	}


}