package java1;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;


	public class BufferedReader4 {
	

		public static void main(String[] args) throws IOException{
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter number");
			long x= Long.parseLong(bf.readLine());
			System.out.println("entered number is:" +x);


}
}