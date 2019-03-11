//Clase para ejecutar el Merge sort

public class MergeSort{

     public static void mergeSort(int array[]){
          int size = array.length, i = 0;
          int middle = size / 2;
          int n1 = size - middle;
          int lf[] = new int [middle];
          int rt[] = new int [n1];


          for(i = 0;i < middle;i++){
               lf[i] = array[i];
          }
          for(i = middle;i < size;i++){
               rt[i] = array[i];
          }
          lt = mergeSort(lf);
          rt = mergeSort(rt);
          if(lf[middle] <= rt[0]){
               append(rt,lt);
          }
          merge(lt,rt,array);
     }
     private static void merge(int left[], rigth[],int array[]){
          int [] result;
          int sizeL = left.length;
          int sizeR = rigth.length;
          int temp = 0;
          while(sizeL > 0 && sizeR > 0){
               if(left[0] <= rigth[0]){
                    temp = left[0];
                    append(temp,result);
                    rest(left);
               } else{
                    temp = rigth[0];
                    append(temp,result);
                    rest(rigth);
               }
          }
          if(left.length > 0){
               append(left,result);
          }
          if(rigth.length > 0){
               append(rigth,result);
          }
          array = result;
     }

     private static void append(){

     }
     private static void rest(int ){

     }
}
