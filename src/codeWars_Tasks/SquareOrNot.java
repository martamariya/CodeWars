/*
 * #To square(root) or not to square(root)

Write a method, that will get an integer array as parameter and will process every number from this array.
Return a new array with processing every number of the input-array like this:

If the number has an integer square root, take this, otherwise square the number.

[4,3,9,7,2,1] -> [2,9,3,49,4,1]
The input array will always contain only positive numbers and will never be empty or null.

The input array should not be modified!
 */



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
