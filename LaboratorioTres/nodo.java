/*clase para los objetos nodos donde almacenara un caracter de la cadena*/

public class Nodo{
	
	private char caracter;
	private Nodo anterior;


	/*
	* setters y getters del nodo
	*----------------------------------------------------------
	*/
	public Nodo(char caracter){
		this.caracter=caracter;
	}

	public void setCaracter(char caracter){
		this.caracter = caracter;
	}

	public char getCaracter(){
		return this.caracter;
	}


	public void setAnterior(Nodo nodo){
		this.anterior = nodo;
	}

	public Nodo getAnterior(){
		return this.anterior;
	}
}