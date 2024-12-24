package pattern;

import java.util.Scanner;

public class rightLeftUp {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = input.nextInt();
		for(int i=0; i<=num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("  ");
			}
			for(int k=i; k<=num; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
