package java1;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;



	public class BufferedReader3 {
	

		public static void main(String[] args) throws IOException{
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter character");
			char x= (char) bf.read();
			System.out.println("entered character is:" +x);

}
	}
