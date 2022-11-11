
package sum;

import java.util.Scanner;

/**
 *
 * @author Norhan
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum  = 0 ;
     Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for(int i = x ; i>=1 ; i--){
            sum+=i;
        }
        System.out.println(sum);
    }
   
}
