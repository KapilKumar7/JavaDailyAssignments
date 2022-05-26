package question2;

public class EvenSum {

	static int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	static void oddEven() {

		for (int j = 0; j < 3; j++) {
			int ans = 0;
			for (int i = 0; i < 3; i++) {

				if ((arr[i][j]) % 2 == 0) {
					ans = ans + arr[i][j];
//					System.out.println(arr[i][j]);
				}
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		oddEven();

	}

}
