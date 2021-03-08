package programs;

import java.util.Scanner;

public class HexArea {

	public static void main(String[] args) {
		int length;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the lenght of a side of the hexagon: ");
		length = scan.nextInt();
		
		System.out.println("The area of the hexagon: "+ (6 * Math.pow(length, 2))/(4*Math.tan(Math.PI/6)));
		
		scan.close();
	}
}
