package question3;

public class Main {

	public int[] findAndReturnPrimeNumbers(int[] inputArray) {

		int[] ans = new int[10];
		int count = 0;
//		sum(count, count)
//	
		for (int x : inputArray) {
			Boolean flag = true;

			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				ans[count++] = x;
		}
		return ans;

	}

	public static void main(String[] args) {
		Main m1 = new Main();

		int[] arr = { 13, 12, 5, 50, 11, 14, 15 };
		int[] finalArr = m1.findAndReturnPrimeNumbers(arr);

		for (int i = 0; i < 7; i++) {
			if (!(finalArr[i] == 0))
				System.out.println(finalArr[i]);
		}
	}
}