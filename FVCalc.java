// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate =  Double.parseDouble(args[1]);
		int numbersOfYears = Integer.parseInt(args[2]); 

		double futureValue = currentValue * Math.pow((rate/100 + 1) , numbersOfYears); 

		System.out.println("After " + numbersOfYears + " years, a $" + currentValue +
						 " saved at " + rate + "% will yield $" + (int) futureValue);

	}
}