/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsequence;

import java.util.Scanner;
    public class subsequence{
    public static void main(String[] args) {
        String A = "hello";
        Scanner input = new Scanner(System.in);
        String B = input.nextLine();
        System.out.println(checkSubSequence(A, B));
        System.out.println(checkSubSequence(B, A));
    }
     public static boolean checkSubSequence(String A, String B){
        if(A==null || B==null)
            return false;

        String longer = A.length()>B.length() ? A : B;
        String shorter = A.length()<=B.length() ? A : B;

        int j = 0;
        for (int i = 0; i < longer.length() && j < shorter.length(); i++) {
            if (longer.charAt(i) == shorter.charAt(j))
                j++;
        }
        if(j==shorter.length())
            return true;

        return false;
    }
}
