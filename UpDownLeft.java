package pattern;

import java.util.Scanner;

public class UpDownLeft {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = input.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-i; j++) {
				System.out.print("  ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("  ");
			}
			for (int k=0; k<num-i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
