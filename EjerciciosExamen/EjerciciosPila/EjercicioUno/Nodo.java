/*
* Clase: Nodo
*--------------------------------------------------------------
*Esta clase tiene la función de crear un nodo para el manejo de
*la pila
*
*@author: Kevin Basto
*/

public class Nodo{
	
	//Atributos del nodo de la pila
	private int valor;
	private Nodo siguiente;

	/*
	* Método: push
	*----------------------------------------------------------
	* Éste método empuja un nodo nuevo a la pila
	*/
	public void push(int valor){
		this.siguiente = new Nodo(valor);
	}


	/*
	* Método: pop
	*----------------------------------------------------------
	* Éste método empuja el elemento siguiente fuera de la pila
	*/
	public void pop(){
		setSiguiente(null);
	}

	/*
	* Método constructor
	*----------------------------------------------------------
	* Éste constructor define los atributos del objeto nodo
	*/
	public Nodo(int valor){
		this.valor = valor;
	}

	/*
	* Setters y Getters del atributo valor
	*----------------------------------------------------------
	* estos setters y getters están definidos para  el atributo
	* valor
	*/
	public void setValor(int valor){
		this.valor = valor;
	}

	public int getValor(){
		return this.valor;
	}

	/*
	* Setters y Getters del atributo siguiente
	*----------------------------------------------------------
	*estos setters y getters están para facilitar la asignación
	*de valores al nodo siguiente de la pila
	*/
	public void setSiguiente(Nodo siguiente){
		this.siguiente = siguiente;
	}

	public Nodo getSiguiente(){
		return this.siguiente;
	}

}