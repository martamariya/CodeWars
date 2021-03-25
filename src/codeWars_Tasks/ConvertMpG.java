package codeWars_Tasks;

public class ConvertMpG {
	 public static float mpgToKPM(final float mpg){
		  float result =  mpg *(float)(1.609344/4.54609188);
		  float roundTo = (float) Math.round(result * 100) /(float) 100.0;
		  return roundTo;
		   }  
		  
	 public static void main(String[] args) {
		
		 System.out.println(mpgToKPM(10));
		// TODO Auto-generated method stub

	}

}
