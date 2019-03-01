/*clase para los objetos nodos donde almacenara un caracter de la cadena*/

public class Nodo{
	
	private char caracter;
	private Nodo siguiente;

	/*
	* Constructor del objeto nodo
	*----------------------------------------------------------
	*/
	public Nodo(char caracter){
		this.caracter = caracter;
	}

	/*
	* setters y getters del caracter
	*----------------------------------------------------------
	*/
	public void setCaracter(char caracter){
		this.caracter = caracter;
	}

	public char getCaracter(){
		return this.caracter;
	}

	/*
	*setters y getter del nodo siguiente
	*----------------------------------------------------------
	*/
	public void setSiguiente(Nodo siguiente){
		this.siguiente = siguiente;
	}

	public Nodo getSiguiente(){
		return this.siguiente;
	}
}