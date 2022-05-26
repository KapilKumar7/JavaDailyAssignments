package question4;

public class CommandLineArgument {

	public static void main(String[] args) {
		int fact = 1;

//		args[0]=5

		int n = Integer.parseInt(args[0]);
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

}
