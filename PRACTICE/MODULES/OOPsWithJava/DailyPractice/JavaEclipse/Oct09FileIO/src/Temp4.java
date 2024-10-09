import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class Temp4{
	
	public static void main(String[] args) {
		
		String str;
		
		try(FileOutputStream fos = new FileOutputStream("abc.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
				Scanner sc = new Scanner(System.in);
				){
			
			while(true) {
				
				System.out.print("Enter date(enter quit to exit): ");
				str = sc.nextLine();
				
				if(str.equalsIgnoreCase("quit")) {
					
					break;
				}
				
				bos.write((str + "\n" ).getBytes());
			}
			
		}catch(IOException e) {
			
			System.err.println(e.getMessage());
		}
	}
}