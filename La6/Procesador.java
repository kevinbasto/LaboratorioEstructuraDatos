/*Clase: Procesador
* la clase del Procesador realiza todas las operaciones de ordenamiento
*/

import java.util.Scanner;

public class Procesador{
    //attributos (de la clase
    private static int[] vector;
    private static int[] fixedvector;
    private static Scanner scanner = new Scanner(System.in);

    //funcion main del sistema
    public static void main(String[] args){

    }

    //funciones relacionadas  con el menu
    //-------------------------------------------------------------------------

    //método del menu
    private static void menu(){
      int selector;
      boolean salir = false;

      do{
        selctor = opciones();
        switch(selector){

        }
      }while(!salir)
    }

    //método de las opciones
    private static int opciones(){
      int selector = 0;



      return selector;
    }

    //funciones relacionadas con los algoritmos de ordenamiento
    //--------------------------------------------------------------------------

    //método del mergesort
    public static void mergeSort(){

    }

    //método del heapsort
    public static void heapSort(){

    }

    //métodos relacionados con aspectos secundarios como swap y random
    //--------------------------------------------------------------------------

    //metodo para hacer el swap
	  private static void swap(int indiceActual, int indiceSiguiente){
		   int auxiliar;

		   auxiliar = fixedVector[indiceActual];
		   fixedVector[indiceActual] = fixedVector[indiceSiguiente];
       fixedVector[indiceSiguiente] = auxiliar;

	}		//fin swap

}
