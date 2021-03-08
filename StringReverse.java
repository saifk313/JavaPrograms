package programs;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		char[] str = scan.nextLine().toCharArray();
		
		for(int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i]);
		}
		scan.close();
	}
}
