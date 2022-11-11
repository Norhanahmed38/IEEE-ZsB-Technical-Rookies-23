
package summ;

import java.util.Scanner;

public class Summ {

    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
     int x=input.nextInt();
      int arr[]=new int[x];
      for(int i=0 ; i<arr.length ;i++){
        arr[i]= input.nextInt() ;
}
      sum_For(arr);
        While_sum(arr, arr.length);
        int m = calculateSum(arr, x);
        System.out.println(m);
    }
      
    
    public static void sum_For(int[]x){
    int sum = 0 ;
    for(int i=0;i<x.length;i++){
        sum+=x[i];
}
        System.out.println(sum);
    }
    public static void While_sum(int[]x,int z){
        z=x.length;
    int sum = 0 , i =0 ;
    while(i<z){
      sum +=x[i];
      i++;      
}
          System.out.println(sum); 
}
        private static int calculateSum(int arr[], int n) {
         if (n <= 0) {
            return 0;
          }
          return calculateSum(arr, n-1 ) + arr[n-1];
       }
}

