package printer;

public class IntegerPrinter {
	private Integer thingsToPrint;
	
	IntegerPrinter(Integer thingsToPrint){
		this.thingsToPrint = thingsToPrint;
	}
	
	public void print() {
		System.out.println(this.thingsToPrint);
	}
}
