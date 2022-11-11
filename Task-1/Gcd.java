/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

import java.util.Scanner;

/**
 *
 * @author Norhan
 */
public class Gcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
       int num1 = input.nextInt()
       , num2 = input.nextInt();
    int gcd = 1;
    for (int i = 1; i <= num1 && i <= num2;i++) {

      if (num1 % i == 0 && num2 % i == 0)
        gcd = i;
    }

    System.out.println(gcd);
    }
    
}
