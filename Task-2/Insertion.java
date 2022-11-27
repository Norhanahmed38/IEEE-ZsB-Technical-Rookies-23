
package insertion;

/**
 *
 * @author Norhan
 */
public class Insertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to define new array
        int[] x = {1,5,7,9,3,4};
       for (int i = 1 ; i<x.length;i++){
           //to choose the key which will compare with
    int k = x[i];
    int j = i-1 ;
    while(j>=0 && x[j]>k){
    x[j+1] = x[j]  ;
    j--;    }
    x[j+1] = k ;
    }
              for (int i = 0 ; i<x.length;i++){
        System.out.print(x[i]+"  ");
        
    }}
    
}
/*
Stable Algorithm :
A sorting algorithm is said to be stable if two objects with equal keys 
appear in the same order in sorted output as they appear in the input 
data .
Insertion sort is stable Algorithm .
Complexity :
• Time 
1) The worst-case (and average-case) complexity of the insertion sort 
algorithm is O(n²). 
2) The best-case time complexity of insertion sort algorithm is O(n) 
time complexity.
• Space
O(1)
*/