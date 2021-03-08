package programs;

import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {
		int number1, number2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		number1 = scan.nextInt();
		
		System.out.print("Enter the second number: ");
		number2 = scan.nextInt();
		
		if ( number1 == number2 )           
            System.out.printf( "%d == %d\n", number1, number2 );  
        if ( number1 != number2 )          
            System.out.printf( "%d != %d\n", number1, number2 );  
        if ( number1 < number2 )          
            System.out.printf( "%d < %d\n", number1, number2 );  
        if ( number1 > number2 )          
            System.out.printf( "%d > %d\n", number1, number2 );  
        if ( number1 <= number2 )          
            System.out.printf( "%d <= %d\n", number1, number2 );  
        if ( number1 >= number2 )          
            System.out.printf( "%d >= %d\n", number1, number2 );
		
		scan.close();
	}
}
