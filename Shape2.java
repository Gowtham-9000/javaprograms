package printingshapes;

public class Shape2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=6;i++) {
			System.out.print(" ");
		}
		System.out.println("@");
		for(int i=6;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.print("@");
			for(int k=6;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=6;j>=i;j--) {
				System.out.print(" ");
			}
			System.out.print("@");
			System.out.println();
		}
		for(int i=6;i>=1;i--) {
			for(int j=6;j>=i;j--) {
			System.out.print(" ");
		}
			System.out.print("@");
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			System.out.print("@");
			System.out.println();
		}
		for(int i=0;i<=6;i++) {
			System.out.print(" ");
		}
		System.out.println("@");
		
	}

}
