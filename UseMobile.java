package object;

public class UseMobile {
	public static void main(String[] args) {
		Mobile mobile1=new Mobile();
		mobile1.brand="SAMSUNG";
		mobile1.price=19_000;
		mobile1.isSmart=true;
		System.out.println(mobile1.brand+" "+mobile1.price+" "+mobile1.isSmart);
		Mobile mobile2=new Mobile();
		mobile2.brand="Iphone";
		mobile2.price=1_20_000;
		mobile2.isSmart=true;
		System.out.println(mobile2.brand+" "+mobile2.price+" "+mobile2.isSmart);
		
			
		
	}

}
