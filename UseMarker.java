package object;

public class UseMarker {
	public static void main(String[] args) {
		Marker marker1=new Marker();
		marker1.brand="camel";
		marker1.price=78;
		marker1.productCode=547896324;
		marker1.weight=54.3f;
		marker1.height=7.3d;
		marker1.isBlack=true;
		System.out.println(marker1.brand+" "+marker1.price+" "+marker1.productCode+" "+marker1.weight+" "+marker1.height+" "+marker1.isBlack);
		
		}

}
