import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tk252ExceptionHandlingUsingJavaThrowsKeyword {

	public static void main(String[] args) throws IOException {
		String name;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		name = br.readLine();  //it is throwing exception because the file may be corrupted or deleted.then it can't read.so io exception.
		
		System.out.println(name);
	
		br.close();
	}

}
