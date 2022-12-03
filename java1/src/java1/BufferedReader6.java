package java1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedReader6 {


	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter byte");
		byte x= Byte.parseByte(bf.readLine());
		System.out.println("entered byte is:" +x);


}


}
