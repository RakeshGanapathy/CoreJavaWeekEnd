package loopingstatements;

public class ForLoop {

	public static void main(String[] args) {
		for (int i = 60; i <= 80; i++) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		for (int start = 65; start >= 0; start--) {
			System.out.print(start + " ");
		}
		System.out.println(" ");
		for (int i = 40; i <= 60; i++) {
			if (i == 45) {
				continue;// which skips the current iteration
				// break; ---> terminates the loop
			}
			System.out.print(i + " ");
		}
		System.out.println(" ");
		for (int i = 40; i <= 60; i++) {
			if (i == 45) {

			} else {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		for (int i = 40; i <= 60; i++) {
			if (i == 45) {

			}
			System.out.print(i + " ");
		}
	}
}
