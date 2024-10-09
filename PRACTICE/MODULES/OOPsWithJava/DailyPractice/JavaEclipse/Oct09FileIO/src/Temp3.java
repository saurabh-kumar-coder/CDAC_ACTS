import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Temp3{
	
	public static void main(String[] args) {
		
		String str;
		
		try(FileReader fr = new FileReader("abc.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("xyz.txt");
			BufferedWriter bw = new BufferedWriter(fw);
				){
			
			while((str = br.readLine()) != null) {
				
				bw.write(str);
				bw.newLine(); 
			}
		}catch(IOException e) {
			
			System.out.println(e.getMessage());
		}
	}
}