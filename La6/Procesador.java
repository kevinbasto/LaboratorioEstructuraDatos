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

      limpiarPantalla();

      System.out.println("Menu auxiliar     \n");
      System.out.println("------------------\n");
      System.out.println("1.-crear vector   \n");
      System.out.println("2.-imprimir vector \n");
      System.out.println("3.-heapSort        \n");
      System.out.println("4.-mergesort       \n");
      System.out.println("5.-imprimir vector \n");
      System.out.println("-------------------\n");
      System.out.println("selecciona una opcion: ");
      selector = scanner.nextInt();

      return selector;
    }

    //funciones relacionadas con los algoritmos de ordenamiento
    //--------------------------------------------------------------------------

    //método que crea el vector
    private static void crearVector(){
        limpiarPantalla();

        System.out.println("introduzca la longitud del arreglo: ");
        int longitud  = scanner.nextInt();
        vector = new int[longitud];

        System.out.println("\n\nintroduzca que método desea implementar  ");
        System.out.println("\n(r=random, i = inverted): ");
        char modo = scanner.next().charAt(0);

        switch(modo){
            case 'r':
                random(longitud);
                break;
            case 'i':
                invertir(longitud);
                break;
        }
    }

    //método del mergesort
    public static void mergeSort(){

    }

    //método del heapsort (código fusilado de geeks for geeks)
    public void heapSort() 
    { 
        fixedvector = vector;
        int n = fixedvector.length; 
  
        // Build heap (rearrange array) 
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(fixedvector, n, i); 
  
        // One by one extract an element from heap 
        for (int i=n-1; i>=0; i--) 
        { 
            // Move current root to end 
            int temp = fixedvector[0]; 
            fixedvector[0] = fixedvector[i]; 
            fixedvector[i] = temp; 
  
            // call max heapify on the reduced heap 
            heapify(arr, i, 0); 
        } 
    } 

    // To heapify a subtree rooted with node i which is 
    // an index in arr[]. n is size of heap 
    void heapify(int arr[], int n, int i) 
    { 
        int largest = i; // Initialize largest as root 
        int l = 2*i + 1; // left = 2*i + 1 
        int r = 2*i + 2; // right = 2*i + 2 
  
        // If left child is larger than root 
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
  
        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
  
        // If largest is not root 
        if (largest != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
  
            // Recursively heapify the affected sub-tree 
            heapify(arr, n, largest); 
        } 
    } 

    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void merge(, int l, int m, int r) 
    { 
        fixedVector = vector;
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = fixedvector[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = fixedvector[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                fixedvector[k] = L[i]; 
                i++; 
            } 
            else
            { 
                fixedvector[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            fixedvector[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            fixedvector[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    void mergeSort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            mergeSort(arr, l, m); 
            mergeSort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
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

    //metodo para crear el vector con orden inverso
    private static void invertir(int longitud){
        for(int i=0; i<longitud; i++)
            vector[i] = longitud-i;

    }

    private static void random(int longitud){

    }

    private static void limpiarPantalla(){
        for(int i = 0; i<1000; i++){
            System.out.println("\n");
        }
    }

}
