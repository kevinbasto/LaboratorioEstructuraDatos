/*
*	Clase: Nodo
*	Objetivo: almacenar cada componente del polinomio que es:
*		->Grado
*		->Literal
*		->Coeficiente
*		->siguiente elemento de la lista ligada
*	@author: Kevin Basto
*/

public class Nodo{
	private int coeficiente;
	private int exponente;
	private char literal;
	private Nodo siguiente;

	//constructor nodo para la creacion del objeto
	//---------------------------------------------------------
	//
	public Nodo(int coeficiente, int exponente, char literal){
		this.coeficiente = coeficiente;
		this.exponente = exponente;
		this.literal = literal;
	}

	//setters y getters del atributo coeficiente
	//---------------------------------------------------------
	//
	public void setCoeficiente(int coeficiente){
		this.coeficiente = coeficiente;
	}

	public int getCoeficiente(){
		return this.coeficiente;
	}

	//setters y getters del atributo exponente
	//---------------------------------------------------------
	//
	public void setExponente(int exponente){
		this.exponente = exponente;
	}

	public int getExponente(){
		return this.exponente;
	}

	//setters y getters del atributo literal
	//---------------------------------------------------------
	//
	public void setLiteral(char literal){
		this.literal = literal;
	}

	public char getLiteral(){
		return this.literal;
	}

	//setters y getters del nodo siguiente
	//---------------------------------------------------------
	//
	public void setSiguiente(Nodo siguiente){
		this.siguiente = siguiente;
	}

	public Nodo getsiguiente(){
		return this.siguiente;
	}
}