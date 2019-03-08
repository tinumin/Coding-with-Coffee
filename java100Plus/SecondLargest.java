
public class SecondLargest {

	public static void main(String[] args) {
		
		int[] a = {8,4,5,6,7,1,2,9,2};
	    int temp = 0;
	    for(int i = 0; i<a.length; i++)
	    {
	    	for(int j = i+1; j<a.length;j++ )
	    	{
	    		if(a[i] < a[j])   // Descending Sort
	    		{
	    			temp = a[i];
	    			a[i] = a[j];
	    			a[j] = temp;
	    		}

	    	}
	    }
	    System.out.println("The second largest number in this Array is: "+a[1]);
	    System.out.println("The second smallest number in this Array is: "+a[a.length - 2]);
	    

	}

}
