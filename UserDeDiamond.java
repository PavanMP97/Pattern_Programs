package pattern;

import java.util.Scanner;

public class UserDeDiamond {
	int i,j,n,space=1;
	void show() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the dimenction");
		n=s.nextInt();
		space=n-1;
		for(j=1;j<=n;j++) {
			for(i=1;i<=n-j;i++) {
				System.out.print(" ");
			}
			space--;
			//System.out.println(space);
			for(i=1;i<=2*j-1;i++) {
				System.out.print("*");
			}
			for(i=1;i<=n-j;i++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	
	space=1;
	for(j=1;j<=n-1;j++) {
		for(i=1;i<=j;i++) {
			System.out.print(" ");
		}
		space++;
		for(i=1;i<=2*(n-j)-1;i++) {
			System.out.print("*");
		}
		for(i=1;i<=j;i++) {
			System.out.print(" ");
		}
		System.out.println();
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
UserDeDiamond u=new UserDeDiamond();
u.show();
	}

}
