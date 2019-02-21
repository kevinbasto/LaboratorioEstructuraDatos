/*clase principal donde implementa el método selection sort y opera con los arraylist
*
*	@author: Kevin Basto
*
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Procesador{

	//arraylist que almacena los equipos
	private static ArrayList<Equipo> equipos = new ArrayList<Equipo>();
	private static int cantidad;

	/*
	*	funcion main
	*-------------------------------------------------------
	*/
	public static void main(String[] args){
		menu();
	}	//fin de la función main

	public static void menu(){
		int selector;
		boolean salir = false;
		Scanner scanner = new Scanner(System.in);

		/*
		* 	elementos del menu\n
		*   -------------------------------------------------\n
		*	1.- introducir elementos al arraylist \n
		*	2.- ordenar elementos del arraylist \n
		*	3.- imprimir orden del arraylist \n
		*	4.- salir
		*/
		while(salir == false){
			
			System.out.println("elementos del menu\n");
			System.out.println("-------------------------------------------------\n");
			System.out.println("1.- introducir elementos al arraylist \n");
			System.out.println("2.- ordenar elementos del arraylist \n");
			System.out.println("3.- imprimir orden del arraylist \n");
			System.out.println("4.- salir del programa \n");
			System.out.println("-------------------------------------------------\n");
			System.out.println("seleccione una opción: ");
			selector = scanner.nextInt();
			switch(selector){
				case 1:
					introduceArreglo();
					break;
				case 2:
					ordenaArreglo();
					break;
				case 3:
					imprimeArreglo();
					break;
				case 4:
					salir = true;
					break;

			}	//fin del selector

		}	//fin del ciclo while

	}	//fin del método menu


	/*
	* Método: introduceArreglo
	*----------------------------------------------------------
	*introduce el arreglo a ordenar
	*/
	private static void introduceArreglo(){
		equipos.clear();
		Scanner scanner = new Scanner(System.in);
		Equipo auxiliar = new Equipo();

		System.out.println("introduzca la cantidad de equipos: ");
		cantidad = scanner.nextInt();


		for(int i = 0; i<cantidad; i++){

			scanner.nextLine();

			System.out.println("\n\n\nintroduzca el nombre del Equipo: ");
			auxiliar.setNombre(scanner.nextLine());

			System.out.println("\n\n\nintroduzca el puntaje del Equipo: ");
			auxiliar.setPuntaje(scanner.nextInt());

			System.out.println("\n\n\nintroduzca el tiempo(milisegundos) del Equipo: ");
			auxiliar.setMilisegundos(scanner.nextInt());

			equipos.add(auxiliar);
		}	//fin del ciclo for

	}	//fin del método introduceArreglo

	/*
	* Método: ordenaArreglo
	*----------------------------------------------------------
	*éste método ordena el arreglo con el algoritmo inserction sort
	*/
	private static void ordenaArreglo(){
		Equipo[] lista = new Equipo[equipos.size()];
		Equipo auxiliar;
		int min;

		for (int i=0; i<equipos.size(); i++){
			lista[i] = equipos.get(i);
		}								//fin del ciclo for para equipos

		for (int i=0; i<equipos.size(); i++){
			min = i;

			for (int j=i+1; j<equipos.size(); j++) {
				if(lista[j].getPuntaje() < lista[min].getPuntaje() )
					min = j;
			}		//fin del ciclo for para j

			auxiliar = lista[i];
			lista[i] = lista[min];
			lista[min] = auxiliar;

		} 		//fin del ciclo for para i

		cantidad = equipos.size();
		equipos.clear();

		for (int i=0; i<cantidad; i++) {
			equipos.add(lista[i]);
		}		//fin del ciclo para el nuevo arraylist ordenado

	}	//fin del método ordenaArreglo





	/*
	*
	*
	*/
	private static void imprimeArreglo(){

		for (int i=0; i<equipos.size(); i++) {
			System.out.println("\n"+equipos.get(i).getNombre());
		}

	}	//fin del método imprimeArreglo

}