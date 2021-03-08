package programs;

import java.util.Scanner;

public class MathClass {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		byte numCount;
		byte sum = 0;
		System.out.println("Average of how many numbers do you want to calculate? ");
		numCount = in.nextByte();
		
		for (byte i = 0; i < numCount; i++) {
			byte[] numbers = new byte[numCount];
			System.out.println("Enter the number (" + (i+1) + "): ");
			numbers[i] =  in.nextByte();
			sum += numbers[i];
		}
		System.out.println("The average of the numbers is: " + (sum/numCount));
		
		String ar[] = new String[5];
		System.out.println(ar.length);
		
	}
}
