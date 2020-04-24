import java.util.*;
public class StrictlyIdentical {

	public static boolean equals(int[] array1, int[] array2) {
		for(int i = 0; i<5; i++) {
			if(array1[i] != array2[i]) { //test each array value for inequality
				return false; //stops method, returns false
			}
		}
		return true; //returns true when all values identical
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //initialize scanner
		
		int list1[] = new int[5]; //declare 1st integer array
		int list2[] = new int[5]; //declare 2nd integer array
		
		System.out.print("Enter 5 elements of list1:"); //prompt for array1
		for(int i = 0; i<5; i++) { //loop for 1st 5 integers
			list1[i]=input.nextInt(); //assign value to array
			
		}
		
		System.out.print("Enter 5 elements of list2:"); //prompt for array2
		for(int i = 0; i<5; i++) { //loop for 1st 5 integers
			list2[i]=input.nextInt(); //assign value to array
			
		}
		
		
		boolean compare = equals(list1, list2); //calls "equals" method
		if(compare == true) { //if method return true
			System.out.println("Two lists are strictly identical.");
		}
		else { //if method return false
			System.out.println("Two lists are not strictly identical.");
		}


	}
}

