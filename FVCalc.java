// Computes the future value of a saving investment.
public class FVCalc {java FVCalc 25000 6 25
	public static void main(String[] args){
		int curValue = Integer.parseInt(args[0]);
		double interRate = Double.parseDouble(args[1])/100;
		int years = Integer.parseInt(args[2]);
		double futValue = curValue * Math.pow((1 + interRate), years);
		interRate *= 100;
		System.out.println("After " + years + " years, $" + curValue +" saved at " + interRate + "% will yield $" + (int)futValue);
	}
}