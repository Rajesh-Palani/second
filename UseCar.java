package object;

public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="hyundai";
		car1.price=1400000;
		car1.colour="black";
		car1.taxAmount=50000;
		car1.isAirBag=true;
		car1.netPrice=car1.price+car1.taxAmount;
		System.out.println(car1.netPrice+" "+car1.brand);
		Car car2=new Car();
		car2.brand="B M W";
		car2.price=4000000;
		car2.colour="Black";
		car2.taxAmount=80000;
		car2.isAirBag=true;
		car2.netPrice=car2.price+car2.taxAmount;
		System.out.println(car2.netPrice+" "+car2.brand);
		
		
	}

}
