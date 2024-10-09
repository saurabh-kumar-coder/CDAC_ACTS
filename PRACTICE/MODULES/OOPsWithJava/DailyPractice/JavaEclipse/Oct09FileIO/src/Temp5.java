import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class Temp5{
	
	public static void main(String[] args) {
		
		int data;
		
		try(FileInputStream fis= new FileInputStream("abc.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
				){
			
			while((data = bis.read()) != -1) {
				
				System.out.print((char)data);
			}
			
			
		}catch(IOException e) {
			
			System.err.println(e.getMessage());
		}
	}
}