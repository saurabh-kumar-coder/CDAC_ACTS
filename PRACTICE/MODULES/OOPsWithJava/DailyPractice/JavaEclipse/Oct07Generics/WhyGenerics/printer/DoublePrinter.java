package printer;

public class DoublePrinter {
	private Double thingsToPrint;

	public DoublePrinter(Double thingsToPrint) {
		this.thingsToPrint = thingsToPrint;
	}
	public void print() {
		System.out.println(this.thingsToPrint);
	}
}
