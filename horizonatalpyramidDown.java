package pattern;

import java.util.Scanner;

public class horizonatalpyramidDown {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = input.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("  ");
			}
			for(int k=0; k<num-i; k++) {
				System.out.print("* ");
			}
			for(int x=0; x<num-i; x++) {
				System.out.print("* ");
			}
			System.out.println("");	
		}
	}

}
