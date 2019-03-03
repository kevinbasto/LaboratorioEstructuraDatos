/*clase que almacenará la información de los equipos que jugarán*/

public class Equipo{
	
	/*atributos de la clase*/
	private String 	nombre;
	private int    	puntaje;
	private int 	milisegundos;

	/*métodos de la clase*/


	/*
	* constructor del equipo
	* ---------------------------------------------------------
	* constructor necesario para poder registrar un equipo
	*/
	public Equipo(String nombre, int puntaje, int milisegundos){
		this.nombre = nombre;
		this.puntaje = puntaje;
		this.milisegundos = milisegundos;
	}

	public Equipo(Equipo equipo){
		this.nombre = equipo.getNombre();
		this.puntaje = equipo.getPuntaje();
		this.milisegundos = equipo.getMilisegundos();
	}

	public Equipo(){
		
	}

	/*
	* setters y getters  del nombre
	*----------------------------------------------------------
	*/

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return this.nombre;
	}

	/*
	* setters y getters del puntaje
	*----------------------------------------------------------
	*/

	public void setPuntaje(int puntaje){
		this.puntaje = puntaje;
	}

	public int getPuntaje(){
		return this.puntaje;
	}

	/*
	* setters y getters de milisegundos
	*----------------------------------------------------------
	*/

	public void setMilisegundos(int milisegundos){
		this.milisegundos = milisegundos;
	}

	public int getMilisegundos(){
		return this.milisegundos;
	}

}