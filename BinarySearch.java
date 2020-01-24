package fiddle;

// Java implementation of iterative Binary Search 
class BinarySearch { 
	
	// Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 5, 7, 9, 10, 40, 50, 95, 96}; 
        int x = 95; 
        int result = ob.binarySearch(arr, x); 
        if (result == -1) 
            System.out.println("Element does not exist"); 
        else
            System.out.println("Element found at " + "index " + result); 
    } 
    
    int binarySearch(int arr[], int x)
    {
    	int n = 0;
    	int j = arr.length - 1;
    	while (n <= j)
    	{
    		// create a new midpoint
        	int mid = (n + j) / 2;
        	
    		// if value is found, return index
    		if (x == arr[mid])
    			return mid;
    		
    		// if value is greater, create greater n value
    		if (x > arr[mid])
    			n++;
    		
    		// if value is less than x, create lesser j value
    		if (x < arr[mid])
    			j--;
    		
    	}		
    	return -1;
    }
  
    
} 