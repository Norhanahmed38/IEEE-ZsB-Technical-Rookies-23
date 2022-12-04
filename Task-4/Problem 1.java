import java.util.Scanner;

public class Main {

    public static int[] max(int[] array){
//        if(end - start == 1) return new int[] {array[start],start};
//        int middle = start + (end - start)/2;
//        int[] a = max(array,start,middle);
//        int[] b = max(array,middle + 1, end);
//        if(a[0] > b[0]) return a;
//        return b;
        int m=array[0];
        int index = 0;
        for (int i = 0; i < array.length;i++){
            if (array[i] > m){
                m = array[i];
                index = i;
            }
        }
        return new int[] {m,index};
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n,k;
        n=input.nextInt();
        k=input.nextInt();
        int[] array =new int[n];
        for(int i=0;i<array.length;i++) {
            array[i] = input.nextInt();
        }
        int[] Eq =new int[max(array)[0] + 1];
        for(int i=0;i<n;i++){
            Eq[array[i]]++;
        }
        for (int i = 0; i < k; i++){
            int index = max(Eq)[1];
            System.out.print(index + " ");
            Eq[index] = 0;
        }
    }
}