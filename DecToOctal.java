package programs;

import java.util.Scanner;

public class DecToOctal {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int dec_num, rem;
        String octal_num="";
        
        /* hexadecimal number digits */
        
        char oct[]={'0','1','2','3','4','5','6','7'};
        
        Scanner in = new Scanner(System.in);
		
        System.out.print("Input a decimal number: ");
        dec_num = in.nextInt();
		
        while(dec_num>0)
        {
            rem = dec_num % 8;
            octal_num = oct[rem] + octal_num;
            dec_num = dec_num / 8;
        }
        System.out.print("Octal number is : "+octal_num+"\n"); 
	}
}
