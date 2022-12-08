package AccessSpecifiers;



public class Book2 {

	public static void main(String[] args) {
		Laptop obj = new Laptop();
		obj.show();
		

	}

}
class Laptop
{
	private int a = 10;
	private int b=20;
	private int total = a+b;
	 void show() {
		System.out.println( "A="+a);
		System.out.println( "B="+b);
		System.out.println( "Total="+total);
	}


	}


