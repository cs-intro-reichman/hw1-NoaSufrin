// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);

		int a = (int) (Math.random()*(lim + 1));
		int b = (int) (Math.random()*(lim + 1));
		int c = (int) (Math.random()*(lim + 1));

		int Min = Math.min(a,(Math.min(b,c)));
		int max = Math.max(a,(Math.max(b,c)));
		int mid = a + b + c - Min - max;

		System.out.println(a + " " + b + " " + c);
		System.out.println(Min + " " + mid + " " + max);
	}
}
