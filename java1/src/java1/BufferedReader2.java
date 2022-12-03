package java1;


	
		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;



		public class BufferedReader2 {
		

			public static void main(String[] args) throws IOException{
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("enter your loc and pin");
				float x= Float.parseFloat(bf.readLine());
				System.out.println("entered pincode is:" +x);
						
	}

}
