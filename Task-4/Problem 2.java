import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String s1,s2;
    boolean flag1 = false;
    boolean flag2 = false;
    Scanner input = new Scanner(System.in);
    s1=input.next();
    s2=input.next();
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    for(int i=0;i<c2.length;i++){
        if(c2[i]==c1[0]){
            for (int j=1;j<c1.length;j++){
                if(c2[i + j] != c1[j]){
                    flag1 = false;
                    break;
                }
                flag1 = true;
            }
        }
    }

    for(int i=0;i<c2.length;i++){
        if(c2[i]==c1[c1.length-1]){
            for (int j= 0;j < c1.length;j++){
                if(c2[i + j] != c1[c1.length - j - 1]){
                    flag2 = false;
                    break;
                }
                flag2 = true;
            }
        }
    }
    System.out.println(flag1 || flag2);
    }
}