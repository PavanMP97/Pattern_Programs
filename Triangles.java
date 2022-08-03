package pattern;

import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		int i,j=1,space=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of rows");
		int row=s.nextInt();
		System.out.println("enter number of column");
		int column=s.nextInt();

		System.out.println(1);
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(i+j<=column+1) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(2);
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(i+j>=column+1) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		System.out.println(3);
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(j>=i) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(4);
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(j<=i) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println(5);
		for(i=1;i<=row;i++) {
			for(j=1;j<=column-i;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=i*2-1;j++) {
				System.out.print("*"+" ");
			}
			for(j=1;j<=column-i;j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(6);
		for(i=1;i<=row;i++) {
			for(j=1;j<=i-1;j++) {
				System.out.print("  ");
				
			}
			for(j=1;j<=column*2-space;j++) {
				System.out.print("*"+" ");
			}
			for(j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			space+=2;
			System.out.println();
		}
		System.out.println();
		System.out.println(7);
		for(i=1;i<=row;i++) {
			for(j=1;j<=column-i;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=i*2-1;j++) {
				System.out.print("*"+" ");
			}
			for(j=1;j<=column-i;j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		space=3;
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("  ");
				
			}
			for(j=1;j<=column*2-space;j++) {
				System.out.print("*"+" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("  ");
			}
			space+=2;
			System.out.println();
		}


	}

}
