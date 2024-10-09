import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class Temp6{
	
	public static void main(String[] args) {
		
		Integer data;
		
		try(FileInputStream fis = new FileInputStream("abc.txt");
			BufferedInputStream  bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("xyz.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
				){
			
			while((data = bis.read()) != -1) {
				
				bos.write(data);
			}
			
		}catch(IOException e) {
			
			System.err.println(e.getMessage());
		}
	}
}