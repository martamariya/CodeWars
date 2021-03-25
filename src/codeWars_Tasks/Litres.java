package codeWars_Tasks;

public class Litres {
	
	static int KeepHydrated(double time){
		
        return (int)Math.floor(time*0.5);
    }

	public static void main(String[] args) {
		 
		    /*Scanner obj = new Scanner(System.in);
		    System.out.println("Please enter time: ");
		    double time = obj.nextInt();*/
		    
		    System.out.println("Nathan will drink: " + KeepHydrated(8) + " litres");
		    
		}
		            
	}


