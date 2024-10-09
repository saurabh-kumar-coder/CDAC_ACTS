import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Temp2{
	
	public static void main(String[] args) {
		
		String str;
		
		try(
			FileReader fr = new FileReader("abc.txt");
			BufferedReader br = new BufferedReader(fr);
				){
			while((str = br.readLine()) != null) {
				
				System.out.println(str);
			}
			
		}catch(IOException e) {
			
			System.out.println(e.getMessage());
		}
	}
}