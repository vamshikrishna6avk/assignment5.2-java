
/*program to searching an element in a one dimensional array using Binary search algorithm*/
package session5;

// here I have created a package as session5assignment2
import java.util.Arrays;
import java.util.Scanner;
//import scanner class is in util folder inside the java folder
	//util contains utility classes
	//scanner is a predefined class for taking inputs from use
public class Binary {
	//declares a class called Binary
		//classes are the basics of opps(object oriented programming
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);//used to takes inputs from use
		System.out.println(" enter the size of an integer array:");
		//system is used to return code
				//Println is used to print text enter the size of an integer array and gives output
		       
		int size = scanner.nextInt();//initializing the size
		int[] binary = new int[size];//initializing new binary size value
		System.out.println(" enter " + size + " elements:");
		// here we are taking  for loop to check the condition for  the size
		for (int i = 0; i < size; i++) {
			binary[i] = scanner.nextInt();//taking inputs from use
		}

		System.out.println("Enter the element to search:");
		
		       
		int element = scanner.nextInt();

		// here we are sorting the array for the binary search,array should be
		// sorted one.

		Arrays.sort(binary);
		for (int i = 0; i < binary.length; i++) {//for loop repeats a statment or group of statements while a given condition is true
			System.out.println(binary[i]);
			
			       

		}

		int result = searchElement(binary, element);//initializing the result
		if (result == -1) {//executing false statement
			System.out.println("Element is not found");
			//system is used to return code
					//Println is used to print text and gives output
			       
		} else {
			System.out.println("Element found at position " + result);
			
			       
		}
	}

	// here we are creating the Method to search the specific element in the
	// array

	private static int searchElement(int[] binary, int element) {

		// here we are applying the Logic to search an element in the array
		// according to binary search

		int start = 0;//initialising start value
		int end = binary.length - 1;//initializing end value
		do {
			int mid = (start + end) / 2;//initializing mid value,mid equals to start plus end divide by 2
			if (element == binary[mid]) {//element equals to binary mid value

				return mid;//returning mid
			}
			if (element < binary[mid]) {//element less than binary mid value

				end = end - 1;//end equal to end minus one
			}
			if (element > binary[mid]) {//element greater than binary mid value
				start = start + 1;//start equal to start plus one
			}

		} while (start <= end);//start less than or equals to end
		return -1;
	}

}

