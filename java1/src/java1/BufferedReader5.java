package java1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedReader5 {


	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number");
		short x= Short.parseShort(bf.readLine());
		System.out.println("entered number is:" +x);


}
}