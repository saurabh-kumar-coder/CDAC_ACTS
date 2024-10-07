package printer;

public class Printer<T> {
	private T thingsToPrint;
	
	Printer(T thingsToPrint) {
		this.thingsToPrint = thingsToPrint;
	}
	
	void print() {
		System.out.println(this.thingsToPrint);
	}
	
}
