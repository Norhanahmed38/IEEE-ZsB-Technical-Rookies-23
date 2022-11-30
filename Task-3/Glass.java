
package glass;

import java.util.Scanner;

public class Glass {

    public static void main(String[] args) {
                   String m  ;
        Scanner input = new Scanner(System.in);
        int z = 0 ;
        int y = 0;
            int n = input.nextInt();
            int x[][] = new int[n][2];
            for(int i = 0 ; i<x.length;i++){
                for(int j= 0 ; j < x[i].length  ;j++){
                    x[i][j] = input.nextInt();
            }
            }
                          for(int i = 0 ; i<x.length;i++){
                      z+=x[i][0];
               }
                int r = x[0][0] ;
                int l = x [0][0] ;

              for(int i = 0 ; i<x.length;i++){    
                 if (x[i][1]>r){
                  l = r ;
                  r = x[i][1] ;}
              }
            if ((r+l)>z) m= "yes" ;
            else m= "No" ;  
        
          System.out.println(m);
    }
    
}
