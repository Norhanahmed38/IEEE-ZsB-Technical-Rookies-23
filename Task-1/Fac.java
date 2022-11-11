/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fac;

import java.util.Scanner;


public class Fac {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        System.out.println(fac(d));
    }
    public static int fac(int x){
       if(x==1 || x==0)
           return 1 ;
       else
           return x*fac(x-1);
    }
}
