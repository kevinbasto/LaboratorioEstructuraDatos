/*
*	Clase: Ordenador
*--------------------------------------------------------------
*	Esta es la única clase del proyecto y tiene la función de
* de almacenar un monton de información aleatoria y ordenarla
* por los múltiples métodos de ordenamiento.
*
*/

import java.util.Scanner;
import java.util.Random;

public class Ordenador{

	//atributos utilizados de la Clase
	private static int[] vector;
	private static int[] fixedVector;
	private static int longitud;
	private static int[] pasos = new int[4];

	//objetos utilizados dentro de la Clase
	private static Scanner scanner = new Scanner(System.in);

	//metodo main
	public static void main(String[] args){

		//configuraciones iniciales del programa
		for(int i=0; i<4; i++)
			pasos[i] = 0;

		menu();
	}

	//seccion de métodos del menu
	//----------------------------------------------------------------------------

	//metodo menu
	private static void menu(){
		int selector;
		boolean salir = false;

		do{

			//limpio el buffer del scanner para evitar el crasheo
			scanner.nextLine();

			//opciones imprime el menu en resumidas cuentas
			opciones();
			selector = scanner.nextInt();

			switch(selector){
				case 1:
					generaVector();
					break;
				case 2:
					impresor();
					break;
				case 3:
					bubbleSort();
					break;
				case 4:
					salir = true;
					break;
			}

		}while(salir == false);
	}

	//metodo opciones
	private static void opciones(){
		System.out.println("			Menu selector										 						 \n");
		System.out.println("---------------------------------------------------\n");
		System.out.println("1.-Generar el vector de enteros										 \n");
		System.out.println("2.-imprimir el vector arreglado										 \n");
		System.out.println("3.-Ordenar por bubble sort												 \n");
		System.out.println("4.-salir																					 \n");
		System.out.println("---------------------------------------------------\n");
		System.out.println("seleccione una opcion: ");
	}

	// seccion de métodos relacionados con el menu
	//----------------------------------------------------------------------------

	//metodo para generar el vector
	public static void generaVector(){

		//preparativos necesarios
		scanner.nextLine();
		vector = null;
		fixedVector = null;

		//solicitud de la longitud del programa
		System.out.println("introduzca la longitud del vector");
		longitud = scanner.nextInt();

		vector = new int[longitud];

		//ciclo de asignación para generar las pruebas
		for(int i=0; i<longitud; i++){
			vector[i] = longitud-i;
		}

		fixedVector = vector;

		/*for(int i=0; i<longitud; i++)
			System.out.println("\n"+vector[i]);*/

	}

	//metodo para imprimir el arreglo
	public static void impresor(){
		for(int i=0; i<longitud; i++)
			System.out.println("\n"+fixedVector[i]);
	}

	//metodo para ordenar por bubbleSort
	public static void bubbleSort(){

		for(int i=0; i<longitud-1; i++){
			for(int j=0; j<longitud-i-1; j++){
				if(fixedVector[j] > fixedVector[j+1]){
					swap(j,j+1);
					pasos[0]++;
				}
			}
		}

		System.out.println("\n\nla cantidad de pasos utilizados fueron: "+pasos[0]);
	}

	//sección de métodos secundarios de la Clase
	//----------------------------------------------------------------------------

	//metodo para hacer el swap
	private static void swap(int indiceActual, int indiceSiguiente){
		int auxiliar;

		auxiliar = fixedVector[indiceActual];
		fixedVector[indiceActual] = fixedVector[indiceSiguiente];
		fixedVector[indiceSiguiente] = auxiliar;

	}		//fin swap


	/*recordatorio de implementar a finales del proyecto*/
	//metodo para generar numeros aleatorios
	private static int random(){
		int valor = 0;

		return valor;
	}

}
