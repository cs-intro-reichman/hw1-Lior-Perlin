// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		// Generating 3 random numbers and making sure they are in the range
		int a = (int)(Math.random()*(double)limit);
		int b = (int)(Math.random()*(double)limit);
		int c = (int)(Math.random()*(double)limit);
		int min = Math.min(Math.min(a,b),c); // Checking the minimal number
		int max = Math.max(Math.max(a,b),c); // Checking the maximum number
		int balance = Math.max(Math.min ( Math.max(a,b),c) ,Math.min ( Math.max(a,c),b)); // Checking for the balanced number
		System.out.println(max + " " + balance + " " + min); // Outprint Max to Min
		System.out.println(min + " " + balance + " " + max); // Outprint Min to Max
	}
}
