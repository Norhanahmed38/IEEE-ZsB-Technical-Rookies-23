
package ispalindrom;
import java.io.*;
import java.util.Scanner;
public class Ispalindrom {

	public static boolean isPalindrome(String str)
	{
		String rev = "";
		boolean ans = false;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (str.equals(rev)) {
			ans = true;
		}
		return ans;
	}
	public static void main(String[] args)
	{
            Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		str = str.toLowerCase();
		boolean A = isPalindrome(str);
		System.out.println(A);
	}
}
