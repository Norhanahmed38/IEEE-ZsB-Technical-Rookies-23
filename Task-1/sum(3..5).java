/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mult;

import java.util.Scanner;


public class Mult {

    public static void main(String[] args) {
   int sum  = 0 ;
     Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for(int i = x ; i>=1 ; i--){
            if(i%5==0 || i%3==0)
            sum+=i;
        }
        System.out.println(sum);
    }
   
    
}
  
