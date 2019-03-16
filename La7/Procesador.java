public class Procesador{
	//attrubytes
	public static int[] vector;
	public static int[] fixedVector;
	public static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args){

	}

	//methods related to menu
	//---------------------------------------------------------------------------------------------

	//method main
	public static void menu(){
		int options;
		boolean status;
		while(status  == false){
			options = options();

			switch(options){
				case 1:
					mkVector();
					break;
				case 2:
					sort();
					break;
				case 3:
					System.out.println("\ninput the element for search: ");
					int element = scanner.nextInt;
					search(element);
					break;
			}
		}
	}

	//method options
	public static int options(){
		int opciones;

		System.out.println("\nmenu");
		System.out.println("\n1.-crear vector");
		System.out.println("\n2.-ordenar vector");
		System.out.println("\n3.-busqueda lineal");
		System.out.println("\n4.-busqueda Merge(NO IMPLEMENTADO)");
		System.out.println("\n---------------------------------");
		System.out.println("\nseleccione: ");
		opciones = scanner.nextInt();

		return opciones;
	}	

	//methods related to sort & search
	//---------------------------------------------------------------------------------------------

	//method for creating the vector
	public static void mkVector(){
		System.out.println("\ninput the vector size: ");
		int size = scanner.nextInt();

		vector = new int[size];

		for(int i=0; i<size; i++)
			vector[i] = random();

		fixedVector = vector;
	}

	//method for sorting (quicksort)
	public static void sort(){
		int size = fixedVector.length;

		for (int i = 0; i < size-1; i++) 
            for (int j = 0; j < size-i-1; j++) 
                if (fixedVector[j] > fixedVector[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    swap(j,j+1); 
                }
	}

	//method for searching
	public static void search(int searchElement){

		for(int i=0; i<fixedVector.length; i++)
			if(fixedVector[i] == searchElement){
				System.out.println("\nelement found at: "+i);
			}else{
				System.out.println("\nelement not found!");
			}


	}

	//other methods related with vectors
	//---------------------------------------------------------------------------------------------

	//method for random
	public static int random(){
		int number = (int)(math.random()*1000);
		return number;
	}

	//method for swap
	public static void swap(int i, int ip1){
		int aux;
		aux = fixedVector[i];
		fixedVector[i] = fixedVector[ip1];
		fixedVector[ip1] = aux; 
	}

}