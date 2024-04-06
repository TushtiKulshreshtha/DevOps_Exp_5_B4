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
//Vishakha Joshi
public class PrintOddNumbers {
    public static void printOddNumbers() {
        System.out.println("Odd numbers between 1 and 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Print a newline after the loop
    }

    public static void main(String[] args) {
        printOddNumbers();
    }
}
//***********************************************************************
//Anishka Sinha 
public class ForLoopExample {
    public static void printNumbers(int n) {
        // Using a for loop to print numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a newline after the loop
    }

    public static void main(String[] args) {
        // Test the function with n = 10
        printNumbers(10);
    }
}
//***********************************************************************
	// printing bill to the user for buying items//
//surya
import java.util.*;
class add{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        //bill=(org amount)+(org amout*18/100)
        float sum=pencil+pen+eraser;
        System.out.println(sum);
        float bill=sum+(sum*0.18f);
        System.out.println("The bill for your shopping including GST is : "+bill);

    }
}
//***********************************************************************
//Siddhant Bhatnagar
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
// **********************************************************************
//Bhoomi's Work
public class RectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows:");
        int row = scanner.nextInt();
        
        System.out.println("Enter the number of columns:");
        int col = scanner.nextInt();
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == (row - 1) || j == 0 || j == (col - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
// **************************************************************
// Vivaswan's Piece Of Code
public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2 * row - 2 * i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2 * row - 2 * i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
// *****************************************************
//Vivek Patel
//Radix Sort
public class RadixSort {

    // A utility function to get the maximum value in arr[]
    static int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(int arr[], int n, int exp) {
        int output[] = new int[n]; // output array
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current digit
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // The main function to that sorts arr[] using Radix Sort
    static void radixSort(int arr[], int n) {
        // Find the maximum number to know number of digits
        int max = getMax(arr, n);

        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is the current digit number
        for (int exp = 1; max / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

    // A utility function to print an array
    static void print(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }}

//********************************************************************
//Akarsh Gupta Work

public class MergeSort {
	public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
    
