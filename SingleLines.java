package pattern;

import java.util.Scanner;

public class SingleLines 
{

	public static void main(String[] args)
	{
		int i,j=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of rows");
		int row=s.nextInt();
		System.out.println("enter number of column");
		int column=s.nextInt();
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(j==row/2+1) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(i==row/2+1) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(i==row/2+1||j==row/2+1) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(i==j) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(i+j==column+1) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();

		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(i+j==column+1||i==j) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(i+j==column+1||i==j||i==row/2+1||j==row/2+1) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
