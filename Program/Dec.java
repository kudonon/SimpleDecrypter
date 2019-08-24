import java.util.Scanner;

public class Dec
{
	public static void main(String[] args) {
		
		char[] list = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		Scanner scan = new Scanner(System.in);
		System.out.println("What would you like to decrypt: ");
		String input = scan.nextLine();
		System.out.println();
		char[] var = converter(input);
		int comp = 0;
		
		for (int j = 0; j < list.length; j++) {
		    for (int k = 0; k < var.length; k++) {
		        for (int l = 0; l < list.length; l++) {
    		        int place = finder(list, var[k]);
    		        if (place >= 25) {
    		            place = place % 26;
    		        }
    		        var[k] = list[place+1];
    		        System.out.println(var);
    		        comp++;
		        }
		    }
		    System.out.println(var);
		}
        System.out.println("\nThe decrypter has ended");
        System.out.println("Number of computations: " + comp);
	}
	
	public static int finder(char[] x, char y) {
	    
	    int value = -1;
	    for (int i = 0; i < x.length; i++) {
	        if (x[i] == y) {
	            value = i;
	        }
	    }
	    return value;
	}
	
	public static char[] converter(String a) {
	    
	    char[] b = new char[a.length()];
	    for (int i = 0; i < a.length(); i++) {
	        b[i] = a.charAt(i);
	    }
	    return b;
	    
	}
	
}





