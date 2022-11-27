package digits;

import java.util.Scanner;
import javafx.application.ConditionalFeature;

public class Digits {
    public static void main(String[] args) {
     
     int x = (int)(Math.random()*1000);
      Scanner input = new Scanner(System.in);
    int hit = 0 ;
    int miss = 0;
    int z = input.nextInt();
    
    int a = z%10 ;
    int b = (z/10)%10 ;
    int c = z/100 ;
    
    int m = x%10 ;
    int n = (x/10)%10 ;
    int o = x/100 ;
    
       if(a==m ) hit ++ ;
       else if(a==o ||a==n) miss ++ ;
       
       if( b==n ) hit ++ ;
       else if (b==m || b==o) miss ++ ;
       
       if(c==o ) hit ++ ;
       else if (c==m || c==n) miss ++ ;
       
       
        System.out.println(x);
        System.out.println(z);
        System.out.println(hit +" hits "+miss+" miss ");
    }

}
