package object;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1=new Bike();
		bike1.brand="Royal Enfeild";
		bike1.color="Black";
		bike1.price=150000;
		bike1.taxamount=10000;
		bike1.discount=5000;
		bike1.netprice=(bike1.price+bike1.taxamount)-bike1.discount;
		System.out.println(bike1.netprice);
		Bike bike2=new Bike();
		bike2.brand="ninja";
		bike2.color="Green";
		bike2.price=900000;
		bike2.taxamount=150000;
		bike2.discount=4000;
		bike2.netprice=(bike2.price+bike2.taxamount)-bike2.discount;
		System.out.println(bike2.netprice);
		
		
		
	}

}
