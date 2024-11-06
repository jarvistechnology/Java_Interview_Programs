package prabu.javaprograms;

public class Second_Largest {
	   public static void main(String args[]){
		      int temp, size;
		      int array[] = {10,60,25,99,196,98,88};
		      size = array.length;

		      for(int i = 0; i<size; i++ ){
		         for(int j = i+1; j<size; j++){

		            if(array[i]>array[j]){
		               temp = array[i];
		               array[i] = array[j];
		               array[j] = temp;
		            }
		         }
		      }
		     
		    	  System.out.println("4th largest number is:: "+array[size-4]);
			
		     
		   }
		}