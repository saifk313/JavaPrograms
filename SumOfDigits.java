package programs;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		int number, sum = 0, i = 0;
		int[] remainder = new int[100];
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		number = scan.nextInt();
		
		while(number != 0) {
			remainder[i++] = number % 10;
			number /= 10;
		}
		
		for(int j = i; j >= 0; j--) {
			sum = sum + remainder[j];
		}
		
		System.out.println("The sum of the digits is: " + sum);
		
		scan.close();
	}
}
