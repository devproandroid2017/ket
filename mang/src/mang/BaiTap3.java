package mang;

public class BaiTap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 8; i++) {
			if (i == 1)
				System.out.println(" *** ");
			if (i == 4)
				System.out.println("*****");

			else {
				for (int j = 1; j <= 2; j++) {

					System.out.print("*   ");
				}

			}
			System.out.println(" ");
			System.out.println(" ");
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println(" ");
		}
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println(" ");
		}

		String str = "devpro vietnam";
		int s = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i <= ch.length; i++) {
			if (ch[i] == 'v') {
				s = s + 1;
				System.out.println("co so chu v la: " + s);
			}

		}

	}

}
