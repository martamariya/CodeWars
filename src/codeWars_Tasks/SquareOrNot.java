package codeWars_Tasks;

import java.util.Arrays;

public class SquareOrNot {
	
	 public static int[] squareOrSquareRoot(int[] array)
	  {
		 
	    for (int i = 0; i < array.length; i++) {
	      if (Math.sqrt(array[i]) == (int)Math.sqrt(array[i])) {
	        array[i] = (int)Math.sqrt(array[i]);
	      }
	      else {
	        array[i] *= array[i];
	      }
	    }
	    return array;
	  }
	


	public static void main(String[] args) {
		
		int[] array = {4,3,9,7,2,1};
		  
		squareOrSquareRoot(array);
		    
		System.out.println("Result: " + Arrays.toString(array));
		// TODO Auto-generated method stub

	}

}
