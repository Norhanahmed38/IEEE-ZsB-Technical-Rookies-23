/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.io.*;
import java.util.Scanner;

public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int n = input.nextInt();
       primeFactors(n);    }
    
   public static int isprime(int n){
      for(int i = 2; i<=Math.sqrt(n); i++){
        if(n%i==0)
          return 0;
      }

      return 1;
   }
    public static void primeFactors(int n)
   {

      for(int i = 2; i<= n; i++){
          if(isprime(i)==1){
             int x = n;
             while(x%i==0){
                System.out.print(i + " ");
                x /= i;
             }
          }
       }

   }
}
