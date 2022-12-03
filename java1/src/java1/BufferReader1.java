package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class BufferReader1 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your loc and pin");
		double x=Double.parseDouble(bf.readLine());
		System.out.println("entered pincode is:" +x);
				
		
	}

	
	}

	

	
	

	
	


