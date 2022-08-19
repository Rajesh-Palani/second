package object;

public class UseFridge {
	public static void main(String[] args) {
	Fridge fridge1=new Fridge();
	fridge1.brand="Samsung";
	fridge1.isWarranty=true;
	fridge1.price=12000;
	fridge1.taxpercentage=10;
	fridge1.discountpercentage=12;
	fridge1.netprice=fridge1.price+(fridge1.price*fridge1.taxpercentage/100)-(fridge1.price*fridge1.discountpercentage/100);
	System.out.println(fridge1.netprice);
	Fridge fridge2=new Fridge();
	fridge2.brand="L G";
	fridge2.isWarranty=false;
	fridge2.price=14000;
	fridge2.taxpercentage=20;
	fridge2.discountpercentage=40;
	fridge2.netprice=fridge2.price+(fridge2.price*fridge2.taxpercentage/100)-(fridge2.price*fridge2.discountpercentage/100);
	
	
	
	
	}

}
