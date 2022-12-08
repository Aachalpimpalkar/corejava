package AccessSpecifiers;



public class Book3 {

	public static void main(String[] args) {
		Dell obj = new Dell();
		obj.showprice();
		

	}

}
class Laptop
{
	 int a = 10;
	 void show() {
		System.out.println( "A="+a);
	}
}
class Dell extends Laptop
{
	 int b=20;
	 int total = a+b;
	 void showprice()
	{
		show();
		System.out.println( "B="+b);
		System.out.println( "Total="+total);
		
}



	}


