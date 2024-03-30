// Aman Verma (Binary Search Unsorted Array)
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

//********************************************************************
//Syed Safi Work
public class Numbers {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int sum = add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        int subt=sub(int num1,int num2);
        System.out.println("The subtraction of " + num1 + " and " + num2 + " is: " + subt);

        int mult=multi(int num1,int num2);
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + mult);
    
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
  
    public static int multi(int a, int b)
    {
        return a*b;
    }
}
//********************************************************************
//Vaibhav Work
//insertion sort
public class insertion {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 90, 12, 1, 76, 9 };
        int n = arr.length;
        System.out.println("Before insertion sort :");
        for (int l : arr) {
            System.out.print(l + " ");
        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("After sorting :");
        for (int m : arr) {
            System.out.print(m + " ");
        }
    }
}
//**********************************************************************

//-------------------------------------------------------------------------------------

//Tushti Kulshreshtha
//Quick Sort
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {9, 2, 4, 7, 3, 7, 10};
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}

//--------------------------------------------------------------------------------------------
