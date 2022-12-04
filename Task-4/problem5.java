
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=input.nextInt();
        int []array[]=new int[x][x];
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                array[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<x;i++){
            for(int j=x-1;j>=0;j--){
                System.out.print(array[j][i]+" ");
            }
            System.out.println();
        }
    }
}