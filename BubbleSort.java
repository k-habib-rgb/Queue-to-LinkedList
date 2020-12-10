
package bubblesort;

public class BubbleSort {
     
  static   public void bubblesort(int[] arr){
    
    int len= arr.length;
    int temp;
    for(int i=0; i < len; i++)
		{  
			for(int j=1; j < (len-i); j++)
			{  
			      
				if(arr[j-1] > arr[j])
				{   
				    
				
					temp = arr[j-1];  
					arr[j-1] = arr[j];  
					arr[j] = temp;
					printArray(arr);
    
    
                                }
      
                        }
                }
}
  static   void printArray(int[] array){
	    
	    for(int i=0; i < array.length; i++)
		{  
			System.out.print(array[i] + " ");  
		} 
	    System.out.println();
	    
	}
 
    

    public static void main(String[] args) {
      int arr[] ={12,98,34,11};  
 
		System.out.println("---Array BEFORE Bubble Sort---"); 
		
	    printArray(arr);
 
		bubblesort(arr); 
 
		System.out.println("---Array AFTER Bubble Sort---");  
		
		printArray(arr); 
        
    }}
