package printer;

public class Impl {
	public static void main(String[] args) {
		IntegerPrinter integerPrinter = new IntegerPrinter(10);
		integerPrinter.print();
		
		DoublePrinter doublePrinter = new DoublePrinter(20.1);
		doublePrinter.print();
		
		Printer<Integer> iPrinter = new Printer<Integer>(20);
		iPrinter.print();
		
		Printer<String> sPrinter = new Printer<String>("Hello Saurabh, You are Awesome.");
		sPrinter.print();
	}
}
