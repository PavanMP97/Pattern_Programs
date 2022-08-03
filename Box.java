package pattern;

import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		int i,j=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of rows");
		int row=s.nextInt();
		System.out.println("enter number of column");
		int column=s.nextInt();
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(i==1||j==column||j==1||i==column) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();	
		}
		System.out.println();
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(j==column||j==1||i==column) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();	
		}
		System.out.println();
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(i==1||i==column||j==1) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
		System.out.println();
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(i==1||j==column||j==1) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();	
		}
		System.out.println();
		
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(i==1||j==column||i==column) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();	
		}
		System.out.println();
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(i==1||j==column||j==1||i==column) {
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();	
		}
		System.out.println();

	}

}
