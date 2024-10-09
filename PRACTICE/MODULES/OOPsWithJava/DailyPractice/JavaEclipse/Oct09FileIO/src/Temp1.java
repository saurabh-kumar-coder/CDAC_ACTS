import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Temp1{
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in);
			FileWriter fr = new FileWriter("abc.txt");
			BufferedWriter br = new BufferedWriter(fr);
				){
			
			while(true) {
				
				System.out.print("Enter data(Enter quit to exit): ");
				String str = sc.nextLine();
				
				if(str.equalsIgnoreCase("quit")) {
					
					break;
				}
				
				br.write(str);
				br.newLine();
			}
			
		}catch(IOException e) {
			
			System.out.println(e.getMessage());
		}
	}
}