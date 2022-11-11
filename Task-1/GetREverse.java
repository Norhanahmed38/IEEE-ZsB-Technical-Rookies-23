/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getreverse;

import java.util.Scanner;

/**
 *
 * @author Norhan
 */
public class GetREverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y  = reverse(x);
        if (x==y)
            System.out.println(y + "\nyes");
        else
         System.out.println(y + "\nNo");   
    }
    public static int reverse(int x){
        int reversed = 0 ;
    while(x != 0) { 
    int digit = x % 10;
    reversed = reversed * 10 + digit;
    x /= 10; }   
    return reversed;
    }
}
