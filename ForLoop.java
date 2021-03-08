package programs;

import java.util.Scanner;

public class ForLoop {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		byte number = in.nextByte();
		
		for(byte i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}
	}
}
