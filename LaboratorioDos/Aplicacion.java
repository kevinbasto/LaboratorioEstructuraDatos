/*
*	Clase: Aplicacion
*	Objetivo: la clase aplicación presenta un menú del sistema de modo que se puede implementar un mejor menú
*	funcion de cada uno de los atributos de la función:
*	->cabezaA:
*	->cabezaB:
*	->cabezaC:
*	->cabezaD:
*	->nodosA:
*	->nodosB:
*	->nodosC:
*	->nodosD:
*/

import java.util.Scanner;

public class Aplicacion{
	//cabezas de las listas
	private static Nodo cabezaA;
	private static Nodo cabezaB;
	private static Nodo cabezaC;
	private static Nodo CabezaD;
	//contadores de los nodos
	private static int  nodosA;
	private static int  nodosB;
	private static int  nodosC;
	private static int  nodosD;

	public static void main(String argv[]){
		menu();
	}

	private static void menu(){
		int selector = 0;
		Scanner scanner = new Scanner(System.in);

		do{
			System.out.println("Menu del programa de la práctica de laboratorio 2\n");
			System.out.println("-------------------------------------------------\n");
			System.out.println("1.-introducir elementos en el polinomio A        \n");
			System.out.println("2.-introducir elementos en el polinomio B        \n");
			System.out.println("3.-imprimir el polinomio A 						 \n");
			System.out.println("4.-imprimir el polinomio B 						 \n");
			System.out.println("5.-generar el polinomio A+B  					 \n");
			System.out.println("6.-generar el polinomio A*B  					 \n");
			System.out.println("0.-Salir del programa							 \n");
			System.out.println("-------------------------------------------------\n");
			System.out.println("seleccione una opcion: ");
			selector = scanner.nextInt();
			clearScreen();

			switch(selector){
				case 1:
					agregaNodo(scanner, cabezaA);
					break;
				case 2:
					agregaNodo(scanner, cabezaB);
					break;
				case 3:
					imprimeNodo(cabezaA);
					break;
				case 4:
					imprimeNodo(cabezaB);
					break;
				case 5:
					generaSuma();
					break;
				case 6:
					generaMultiplicacion();
					break;
				default:

					break;
			}

		}while(selector != 0);
	}

	/*
	*	agregaNodo
	*   ----------------------------------------------------------
	*	este método agrega nodos a la lista de modo que los va acomodando
	*	conforme al exponente
	*/
	private static void agregaNodo(Scanner scanner, Nodo cabeza){
		int exponente;
		int coeficiente;
		char literal;

		clearScreen();
		System.out.println("Bienvenido al sistema para agregar nodos a la lista\n");
		System.out.println("---------------------------------------------------\n");
		System.out.println("introduzca el exponente: ");
		exponente = scanner.nextInt();
		clearScreen();
		System.out.println("");
	}

	private static void imprimeNodo(Nodo cabeza){

	}

	private static void generaSuma(){
		Nodo auxiliarA = cabezaA;
		Nodo auxiliarB = cabezaB;
	}

	private static void generaMultiplicacion(){
		Nodo cabezaA;
		Nodo cabezaB;
		Nodo auxiliar;
	}



	/*
	*	este método tiene la funcion de presentar una pantalla sin elemento, pese a que realmente no borra la pantalla
	*-----------------------------------------------------------------------------------------------------------------
	* este metodo por una serie de ciclos for imprime una serie de saltos de linea de modos que "limpia la pantalla"
	*/
	public static void clearScreen(){
    	for(int i=0; i<5 ; i++)
    		System.out.println("\n");
	} 
}