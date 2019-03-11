import java.util.Scanner;
import java.util.Random;

public class Procesador{
    
    //atributos del programa
    private static int[]   vector;
    private static int[]   fixedVector;
    private static int heapSteps = 0;
    private static int mergeSteps = 0;
    private static Scanner scanner = new Scanner(System.in);

    // main program
    public static void main(String[] args){
        menu();
    }

    //method related to menu
    //---------------------------------------------------------------------------------------------

    //menu
    private static void menu(){
        int selector;
        boolean salir = false;

        do{
            selector = opciones();

            switch(selector){
                //case 1 creates the vector
                case 1:
                    createVector();
                    break;
                //case 2 prints the function
                case 2:
                    printVector();
                    break;
                case 3:
                    heapSort();
                    break;
                case 4:

                    mergeSort(0,fixedVector.length-1);
                    break;
                case 5:
                    salir = true;
                    break;
            }
        }while(!salir);
    }

    private static int opciones(){
        int selector;

        System.out.println("menu    \n");
        System.out.println("------------------------------------------------------------------\n");
        System.out.println("1.-create vector \n");
        System.out.println("2.-print vector \n");
        System.out.println("3.-Heapsort \n");
        System.out.println("4.-MergeSort \n");
        System.out.println("5.-exit \n");
        System.out.println("------------------------------------------------------------------\n");
        System.out.println("option: ");
        selector = scanner.nextInt();

        return selector;
    }

    //methods related to vector working
    //---------------------------------------------------------------------------------------------

    //method which creates the vector
    private static void createVector(){
        clScreen();
        int tipo;
        int size;

        heapSteps = 0;
        mergeSteps = 0;

        scanner.nextLine();

        System.out.println("input the vector size: ");
        size = scanner.nextInt();

        //creating the vector 
        vector = new int[size];
        fixedVector = vector;

        System.out.println("Chose a option to create a vector   \n");
        System.out.println("(0 = random, 1 = inverse, 2 = manual)       \n");
        System.out.println("seleccione: ");
        tipo = scanner.nextInt();

        switch(tipo){
            case 0:
                random();
                break;
            case 1:
                inverted();
                break;
            case 2:
                manual();
                break;
        }
    }

    //method which prints the vector
    private static void printVector(){
        clScreen();
        for(int i=0; i<fixedVector.length; i++)
            System.out.println("\n"+fixedVector[i]);

    }


    //Random number generator for the vector
    private static void random(){
        
        for(int i=0; i<fixedVector.length; i++)
            fixedVector[i] = (int)(Math.random() * 200 + 1);

        vector = fixedVector;
    }

    //Inverse number generator for the vector
    private static void inverted(){

        for(int i=0; i<fixedVector.length; i++)
            fixedVector[i] = fixedVector.length - i;

        vector = fixedVector;
    }

    //manual input for the vector
    private static void manual(){
        clScreen();
        for(int i=0; i<fixedVector.length; i++){
            System.out.println("introduzca el valor: ");
            fixedVector[i] = scanner.nextInt();
        }
    }

    //method heap
    private static void heapSort(){
        fixedVector = vector;
        

        int n = fixedVector.length;
   
        // Build heap (rearrange array) 
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify( n, i); 
  
        // One by one extract an element from heap 
        for (int i=n-1; i>=0; i--) 
        { 
            // Move current root to end 
            swap(0,i); 
  
            // call max heapify on the reduced heap 
            heapify( i, 0); 
        }

        System.out.println("\n este metodo para odenar le tomo: "+heapSteps+" pasos");
    }

    //method heapify
    private static void heapify(int n, int i){
        heapSteps++;

        int largest = i; // Initialize largest as root 
        int l = 2*i + 1; // left = 2*i + 1 
        int r = 2*i + 2; // right = 2*i + 2 
  
        // If left child is larger than root 
        if (l < n && fixedVector[l] > fixedVector[largest]) 
            largest = l; 
  
        // If right child is larger than largest so far 
        if (r < n && fixedVector[r] > fixedVector[largest]) 
            largest = r; 
  
        // If largest is not root 
        if (largest != i) 
        { 
            int swap = fixedVector[i]; 
            fixedVector[i] = fixedVector[largest]; 
            fixedVector[largest] = swap; 
  
            // Recursively heapify the affected sub-tree 
            heapify( n, largest); 
        } 
    }

    //method for mergesort
    private static void mergeSort(int l, int r){
        mergeSteps++;
        fixedVector = vector;

        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            mergeSort( l, m); 
            mergeSort( m+1, r); 
  
            // Merge the sorted halves 
            merge(l, m, r); 
        } 

        System.out.println("hecho en: "+mergeSteps+" pasos!");
    }

    private static void merge(int l, int m, int r){
        mergeSteps++;

        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = fixedVector[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = fixedVector[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                fixedVector[k] = L[i]; 
                i++; 
            } 
            else
            { 
                fixedVector[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            fixedVector[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            fixedVector[k] = R[j]; 
            j++; 
            k++; 
        }
    }


    //methods related to secondary functions
    //---------------------------------------------------------------------------------------------
    
    //clScreen clear screen
    public static void clScreen(){
        
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void swap(int posA, int posB){
        int temp = fixedVector[posA];
        fixedVector[posA] = fixedVector[posB];
        fixedVector[posB] = temp;
    }

    
}