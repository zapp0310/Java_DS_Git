package Java;

import java.util.Scanner;

public class Dec_Bin {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		long decimal = sc.nextLong();
		long binary = convert(decimal);
		System.out.println(decimal + "\t:\t" + binary);
		sc.close();
	}
	private static long convert(long decimal) {
			int digit=0;
			long binary=0;
		while(decimal>0) {
			digit=(int)decimal%2;
			decimal/=2;
			if(digit==0)
				binary*=10;
			else 
				binary=(binary*10)+1;
		}
		return binary;
	}
}
