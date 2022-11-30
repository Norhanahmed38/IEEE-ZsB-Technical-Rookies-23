
package difference;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;;
import java.util.regex.*;

public class Difference {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[][] = new int[n][n];
        int primaryDiagSum = 0;
        int secondaryDiagSum = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = input.nextInt();
                
                if(a_i == a_j){
                    primaryDiagSum += a[a_i][a_j];
                }
                
                if(a_i+1+a_j+1 == n+1){
                    secondaryDiagSum += a[a_i][a_j];
                }                
            }
        }
        System.out.println(Math.abs(primaryDiagSum - secondaryDiagSum));
    }
}
