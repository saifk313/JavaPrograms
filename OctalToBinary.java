package programs;

import java.util.Scanner;

public class OctalToBinary {

	public static void main(String[] args) {
		int octal, i = 0;
		int[] remainder = new int[100];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input an Octal Number: ");
		
		octal = scan.nextInt();
		
		while(octal != 0) {
			octal /= 10;
			remainder[i++] = octal % 10;
		}
		
		for(int j = i; j > 0; j--) {
			System.out.print(remainder[j]);
		}
		
		scan.close();
	}
}
