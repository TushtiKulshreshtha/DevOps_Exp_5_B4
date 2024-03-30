import java.util.*;
public class binarySearchUnsort{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter array Size");
		int size=obj.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++){
			arr[i]=obj.nextInt();
		}

        System.out.println("Sorted Array");
		Arrays.sort(arr);
	    System.out.println("Enter the target number");
	    int target=obj.nextInt();

	    int start=0;
	    int end=size-1;
	    while(start<=end){
	    	int mid=start+(end-start)/2;
	    	if(arr[mid]==target){
	    		System.out.println("Element index is "+mid);
	    		return;
	    	}
	    	else if(arr[mid]<target){
	    		start=mid+1;

	    	}
	    	else{
	    		end=mid-1;
	    	}
	    }
	    System.out.println("Element does not found");

	}
}
