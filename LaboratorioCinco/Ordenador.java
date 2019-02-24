/*
*	Clase: Ordenador
*--------------------------------------------------------------
*	Esta es la única clase del proyecto y tiene la función de
* de almacenar un monton de información aleatoria y ordenarla
* por los múltiples métodos de ordenamiento.
*
*/

public class Ordenador{





	public static void bubbleSort(int array[], int n){
		int i, j, temp, conta = 0;

		for(i =  0;i < n - 1;i++){
			//el ultimo elemento esta trivialmente ordenado
			for(j = 0; j < n - i - 1; j++){
				//si el elemento
				if(array[j] > array[j+1]){
					swap(array, j, j+1);
					conta++;
				}
			}
		}
	}


	private static void swap(int i, int j){//donde i y j son las posiciones a intercambiar
		int temp;
		//se realiza el swap
		temp = vector[i];
		vector[i] = vector[j];
		vector[j] = temp;
	}
}
