/*
* Clase: Aplicacion
*--------------------------------------------------------------
*Ésta clase contiene las operaciones principales de la pila
* y contiene a la pila en sí
*
* @author: Kevin Basto
*/

import java.util.Scanner;

public class Aplicacion{
	
	//atributos para el manejo de la tabla
	private static Nodo pila;
	private static int  tope;
	private static int maximo;

	/*
	* Método: main
	*----------------------------------------------------------
	* éste método es el principal método del programa
	*/

	public static void main(String[] argv){
		tope = 0;
		maximo = 50;

		menu();
	}


	/*
	* Método menu
	*----------------------------------------------------------
	* éste método crea un menú de consola para manejar el
	* sistema
	*/
	public static void menu(){

		//variables del método
		Scanner s = new Scanner(System.in);
		int selector;

		do{
			System.out.println("Menu de la pila								   \n");
			System.out.println("-----------------------------------------------\n");
			System.out.println("1.-añadir elemento a la pila				   \n");
			System.out.println("2.-eliminar elemento de la pila				   \n");
			System.out.println("3.-imprimir pila							   \n");
			System.out.println("4.-imprime el último elemento de la pila	   \n");
			System.out.println("5.-determinar si la pila está vacía			   \n");
			System.out.println("-----------------------------------------------\n");
			System.out.println("seleccione una opcion: ");
			selector = s.nextInt();

			switch(selector){
				case 1:
					agregaElementoPila(s);
					break;
				case 2:
					pop();
					break;
				case 3:
					imprimePila();
					break;
				case 4:
					peek();
					break;
				case 5:
					isEmpty();
					break;
				default:
					selector = 0;
					break;
			}

		}while(selector != 0);
	}								//fin del método menu


	/*
	* Método agregaElementoPila
	*----------------------------------------------------------
	* éste método agrega un elemento a la pila
	*/
	public static void agregaElementoPila(Scanner s){

		//atributos del método agregaElementoPila
		int valor;

		if(tope == 0){
			System.out.println("\n\n\nintroduzca el primer elemento a la pila: ");
			valor = s.nextInt();
			pila = new Nodo(valor);
			return;
		}

		System.out.println("\n\n\nintroduzca el elemento que se agregara a la pila: ");
		valor = s.nextInt();

		if(push(valor)){
			System.out.println("\n\n\nelemento agregado a la pila correctamente");
		}else{
			System.out.println("\n\n\nel elemento no pudo ser agregado a la pila");
		}
	}

	/*
	* 	Método: push
	*----------------------------------------------------------
	* éste método añade el elemento a la pila.
	* éste método tiene un retorno booleano debido a que
	* determina si se puede añadir el elemento a la pila debido
	* al tamaño actual de la pila
	*/
	public static boolean push(int valor){
		Nodo auxiliar = pila;

		if(tope == maximo){
				return false;
		}

		while(auxiliar.getSiguiente() != null){
			auxiliar = auxiliar.getSiguiente();
		}

		auxiliar.setSiguiente(new Nodo(valor));
		tope++;

		return true;
	}

	/*
	* Método: pop
	*----------------------------------------------------------
	* éste método elimina el último elemento de la pila
	*/
	public static void pop(){
		Nodo auxiliar = pila;
		Nodo previoAuxiliar = auxiliar;

		while(auxiliar.getSiguiente() != null){
			previoAuxiliar = auxiliar;
			auxiliar = auxiliar.getSiguiente();
		}

		previoAuxiliar.setSiguiente(null);
		tope--;
	}


	/*
	* Método imprimePila
	*----------------------------------------------------------
	* éste método imprime la pila
	*/
	public static void imprimePila(){
		Nodo auxiliar = pila;

		while(auxiliar.getSiguiente() != null){
			System.out.println("\n\n\n"+auxiliar.getValor());
			auxiliar = auxiliar.getSiguiente();
		}
	}


	/*
	* Método: peek
	*----------------------------------------------------------
	* éste método imprime el fondo de la pila
	*/
	public static void peek(){
		Nodo auxiliar = pila;

		System.out.println("\n\n\n"+auxiliar.getValor());
	}


	/*
	* Método: isEmpty
	*----------------------------------------------------------
	* éste método determina si la pila está vacía
	*/
	public static void isEmpty(){
		if(tope == 0){
			System.out.println("la pila está vacía");
		}else{
			System.out.println("la pila no está vacía");
		}
	}
}																			//fin de la clase