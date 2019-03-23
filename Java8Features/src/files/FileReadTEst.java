package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTEst {

	public static void main(String[] args) {
		String filePath = "C:/Users/nages/workspace/Java8Features/src/com/xml/book1.xml";
		BufferedReader in=null;
		String ls = System.getProperty("line.separator");
		try {
		in
		   = new BufferedReader(new FileReader(filePath));
				   StringBuilder stringBuilder = new StringBuilder();
		
			while(in.readLine()!=null){
				
				stringBuilder.append((in.readLine()));
				stringBuilder.append(ls);
			}
			System.out.print(stringBuilder.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
