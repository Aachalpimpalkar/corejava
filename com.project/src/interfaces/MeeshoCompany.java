package interfaces;

interface MeeshoCompany {
	abstract void menu();
	abstract void orderline();
	abstract void delivery();
}
class Pareedhan implements MeeshoCompany 
{
	   public void menu(){
		System.out.println("Western Dress");
		System.out.println("Mini Scirt");
		System.out.println("Top");
	}
	   
	   public void orderline()
	   {
			System.out.println("Receive by Meesho");
			System.out.println("isshue the order by pareedhan shop");
			System.out.println("pareedhan shop will show ");
	   
	   
	   
}
	   
	   public void delivery()
	   {
			System.out.println("handover the Dress by pareedhan shop delevery person");
			
	   }
	   
	   
	   
	   
	   
	   class Rajdhani implements MeeshoCompany 
	   {
	   	   public void menu(){
	   		System.out.println("Shorts");
	   		System.out.println("longs");
	   		System.out.println("Jeans");
	   	}
	   	   
	   	   public void orderline()
	   	   {
	   			System.out.println("Receive by Meesho");
	   			System.out.println("isshue the order by rajdhani shop");
	   			System.out.println("rajdhani shop will show ");
	   	   
	   	   
	   	   
	   }
	   	   
	   	   public void delivery()
	   	   {
	   			System.out.println("handover the Dress by rajdhani shop delevery person");
	   			
	   	   }
	   	   
	   	   
	   	   class MeeshoApp{
	   		MeeshoCompany selectshop(char ch) {
	   			if (ch=='p') {
	   				return new Pareedhan();
	   			}
	   			else {
	   				return new Rajdhani();
	   			}
	   		}
	   	   }
	   	   
	   	   
public class User{
	public static void main(String[] args) {
		   MeeshoApp ref =new MeeshoApp();
		   MeeshoCompany mc = ref.selectshop('r');
		   mc.menu();
		   mc.delivery();
		   mc.orderline();
	}
}
	   
	   		   
 

	   		   
	   	   
	   
		

	
	   	   


