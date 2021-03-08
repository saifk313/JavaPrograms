package programs;

import java.util.Scanner;

public class PolygonArea {

	public static void main(String[] args) {
		int sideNum, length;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input the number of sides on the polygon: ");
		sideNum = scan.nextInt();
		
		System.out.print("Enter the lenght of a side of the polygon: ");
		length = scan.nextInt();

		System.out.println("The area of the polygon is: " + (sideNum * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / sideNum)));

		scan.close();
	}
}
