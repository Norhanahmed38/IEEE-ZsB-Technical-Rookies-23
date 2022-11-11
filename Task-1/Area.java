
package area;


import java.util.Scanner;

public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
       Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int width = input.nextInt();
        System.out.println(length*width);
        System.out.println(2*(length+width));
    }
    
}
