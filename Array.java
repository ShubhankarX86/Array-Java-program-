import java.util.Scanner;

class arr{
	
	static 
    {
		 System.out.println("Hello there, welcome!!");
		 System.out.println();
		 System.out.println("This application will allow you to create your own array, compute out the sum of it's values, enables you to search for a certain value, sort the array in an ascending order, find the largest element in the array, find the average value of the array and also find the duplicate elements in the array(if any).");
		 System.out.println();
		 System.out.print("Enter the length of the array: ");
         
    } 
	
	
	Scanner s = new Scanner(System.in);
	int arrLength = s.nextInt();
	int arr[] = new int[arrLength];
	
	public arr(){ //this constructor takes the input of the array values.
		
		Scanner s = new Scanner(System.in);
		System.out.println();
		int j = arrLength;
		for(int i = 0; i < j; i++) {
			
			System.out.print("Enter the value of index number " + i + ": ");
			arr[i] = s.nextInt();
		}
	
		
}

	public void printArray() { //this method prints the array.
		
		System.out.println();
		System.out.print("Here is the array: [");
		int j = arrLength;
		for(int i = 0; i < j; i++) {
			System.out.print(arr[i]);
			if(i < j - 1) {
				System.out.print(", ");	
			}
			
			
		}
		System.out.print("]");
		System.out.println();
		System.out.println();
	}
	
	public void arraySum() { //this method prints the sum of the values of the array.
		
		int sum = 0;
		int j = arrLength;
		for(int i = 0; i < j; i++) {
			 sum = sum + arr[i];
		}

		fakeFrontEndInterface();
		System.out.println();  
		System.out.print("Here is the sum of the values of the array: ");
		System.out.print(sum);
		System.out.println();
		System.out.println();
		
		float avg = (float)sum/arr.length;  //code for finding the average of values in array
		System.out.print("The average value of the array: " + avg);
	}
	
	
	public void searchValue() {  //this method takes input from the user and searches the array for the input number.
		
		
		System.out.println();
		System.out.println();
		System.out.print("Enter the value you want to search in the array: ");
		
		int searchVal = s.nextInt();
		
		int j = arrLength;
		for(int i = 0; i < j; i++) {
			if(arr[i] == searchVal) {
				
				System.out.print("Yes, " + searchVal + " does exist in the array.");
				break;
			}
			else {
				System.out.print("No, " + searchVal + " does not exist in the array.");
				break;
			}
		}
		
		System.out.println();
		
	}
	
	
	public void bubbleSortArray() { //this method sorts the array in ascending order and also prints it out.
		
		int arraySize = arr.length;
		int temp = 0;
		int y = 0;
		
		for(int w = 0; w < arraySize - 1; w++) {
			
			boolean sorted = true;
			for( y = 0; y < arraySize - 1 - w; y++) {
				
				if(arr[y] > arr[y+1]) {
					temp = arr[y+1];
					arr[y+1] = arr[y];
					arr[y] = temp;
					
					sorted = false;
				}
			}
			if(sorted) break;
		}
		
		System.out.println();
		fakeFrontEndInterface();
		System.out.println(); 
		
		System.out.println("This is the sorted version of the array you created in an ascending order by using the Bubble sort technique:");
		System.out.print("[");
		
		for(y = 0; y < arraySize; y++) {
			System.out.print(arr[y]);
			if(y < arraySize - 1) {
				System.out.print(", ");	
			}
		}
		System.out.print("]");
		System.out.println();
		System.out.println();
		
		System.out.print("The largest element in the array: " + arr[arr.length - 1]);
		
		
	}
	
	public void duplicateElement() {  //this method searches the array(in linear fashion) for any duplicate elements and print them out.
		

             System.out.println();
             System.out.println();
             System.out.print("Duplicate numbers in the array: ");
         	
     		
     		for(int i = 0; i < arr.length - 1; i++) {
     			if(arr[i] == arr[i+1]) {
     				System.out.print(arr[i] + " ");
     				
     			}
     		}
	}
	
	public void fakeFrontEndInterface() { //this method will create a fake front-end progress update interface.
		

		int percentage = 0; 
		int d = 9;
		for(int f = 0; f <= d; f++) {
			percentage = percentage + 10;
			System.out.println("processing " + percentage + "%");
		}
		
		System.out.println("Data processed!");
		
		
	}
	
	public void insertValue() { //this method will create a fake front-end progress update interface.
		
		System.out.println();
		System.out.println();
		System.out.print("Enter the new size of the same array: ");
		
		
		int length = s.nextInt();
		int arr1[] = new int[length];
		
		System.out.println();
		
		
		int differential = arr1.length - arr.length;
		
	    for(int e = 0; e < differential; e++) {
	    	System.out.print("Enter the value at " + e + "th index: ");
	    	arr1[e] = s.nextInt();
	    }
	    
	    int y = 0;
	    for(int i = differential; i < arr1.length; i++) {
	    	arr1[i] = arr[y];
	    	y++;
	    	
	    }
	    
	    System.out.println();
	    System.out.println();
	    System.out.print("The resultant array: ");
	    
	    for(int i = 0; i < arr1.length; i++) {
	    	if(i == 0) {
	    		System.out.print("[");
	    	}
	    	System.out.print(arr1[i]);
	    	
	    	if(i != arr1.length - 1) {
	    		System.out.print(", ");
	    	}
	    	if(i == arr1.length - 1) {
	    		System.out.print("]");
	    	}
	    	
	    }
	}
	
}
public class program {
	
public static void main(String args[]) {
		
		arr obj = new arr();
		obj.printArray();  //this line of code calls the printArray() method from class Array
		obj.arraySum();  //this line of code calls the arraySum() method from class Array
	    obj.searchValue();  //this line of code calls the searchValue() method from the class Array
	    obj.bubbleSortArray();  //this line of code calls the bubbleSortArray() method from the class Array
	    obj.duplicateElement();  //this line of code calls the duplicateSum() method from the class Array
	    obj.insertValue();  //this line of code calls the insertValue() method from the class Array
}

}
