package core_java;

import java.io.*;

public class BufferExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Your name");
		String str = br.readLine();
		System.out.println(str);
	}

}
