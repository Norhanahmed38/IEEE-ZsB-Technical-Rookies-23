
package game;


import java.util.Scanner;

/**
 *
 * @author Norhan
 */
public class Game {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
                
        int result = num;  
          
        while(result != 1 && result != 4){  
            result = sumDigitSquare(result);  
        }  
          
        if(result == 1)  
            System.out.println("True");  
        else if(result == 4)  
            System.out.println("false");     
     
}

   static int sumDigitSquare(int n)
{
    int sq = 0;
    while (n > 0)
    {
        int digit = n % 10;
        sq += digit * digit;
        n = n / 10;
    }
    return sq;
}

        
    
}
