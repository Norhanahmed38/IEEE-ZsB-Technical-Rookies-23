
package heap;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Norhan
 */
public class Heap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int []x = new int [10];
       for(int i =0 ; i<x.length;i++){
        x[i] = input.nextInt();        
       }
                  sort(x);
       for(int i =0 ; i<x.length;i++){
           System.out.print(  x[i]+ "       ");       
       }
    }
    public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

 static void heapify(int arr[], int n, int i)
{
    int largest = i;  // Initialize largest as root
    int l = 2*i + 1;  // left = 2*i + 1
    int r = 2*i + 2;  // right = 2*i + 2
    // If left child is larger than root
    if (l < n && arr[l] > arr[largest])
        largest = l;
    // If right child is larger than largest so far
    if (r < n && arr[r] > arr[largest])
        largest = r;
    // If largest is not root
    if (largest != i)
    {
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;
        // Recursively heapify the affected sub-tree
        heapify(arr, n, largest);
    }
}

}
