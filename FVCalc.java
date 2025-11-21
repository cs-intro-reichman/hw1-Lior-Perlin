// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Creating variables
		int curValue = Integer.parseInt(args[0]);
		double interRate = Double.parseDouble(args[1])/100; // Making sure the interRate is created
		int years = Integer.parseInt(args[2]);
		double futValue = curValue * Math.pow((1 + interRate), years); // Calculating the future value
		interRate *= 100; // changing the Rate back to pracentage
		System.out.println("After " + years + " years, $" + curValue +" saved at " + interRate + "% will yield $" + (int)futValue);
	}
}