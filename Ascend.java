// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		int a = (int)(Math.random()*(double)limit);
		int b = (int)(Math.random()*(double)limit);
		int c = (int)(Math.random()*(double)limit);
		int min = Math.min(Math.min(a,b),c);
		int max = Math.max(Math.max(a,b),c);
		int balance = Math.max(Math.min ( Math.max(a,b),c) ,Math.min ( Math.max(a,c),b));
		System.out.println(max + " " + balance + " " + min);
		System.out.println(min + " " + balance + " " + max);
	}
}
