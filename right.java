package pattern;

import java.util.Scanner;

public class right {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = input.nextInt();
		for(int i=0; i<=num ; i++) {
			for(int j=i; j<=num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
