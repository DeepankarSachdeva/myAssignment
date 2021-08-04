package TOLLBOOTH;

public interface TRUCKS {
	void Weight();
	void Axel();
	int Calculation();
}
class FordTruck implements TRUCKS{
	
	@Override
	public void Weight() {
		int weight;
		weight=12000;
		System.out.println("Weight of Ford Truck : "+weight+" kilograms");
	}
	@Override
	public void Axel() {
		int axl;
		 axl=5;
		System.out.println("Number if Axels in Ford Truck : "+axl);
		
	}
	@Override
	public int Calculation() {
		int div,sum,w,a;
		w =12500;
		a= 5;
		div=(12500/500)*10;
		sum=(a*5)+div;
		System.out.println("Total Due : $"+sum);
		return sum;
	}
}

class Nissan implements TRUCKS{
	
	@Override
	public void Weight() {
		int weight;
		weight=5000;
		System.out.println("Weight of Ford Truck : "+weight+" kilograms");
	}
	@Override
	public void Axel() {
		int axl;
		 axl=2;
		System.out.println("Number if Axels in Ford Truck : "+axl);
		
	}
	@Override
	public int Calculation() {
		int div,sum,w,a;
		w =5000;
		a= 2;
		div=(w/500)*10;
		sum=(a*5)+div;
	System.out.println("Total Due : $"+sum);
		return sum;
	}
}

class Daewoo implements TRUCKS{
	
	@Override
	public void Weight() {
		int weight;
		weight=17000;
		System.out.println("Weight of Ford Truck : "+weight+" kilograms");
	}
	@Override
	public void Axel() {
		int axl;
		 axl=6;
		System.out.println("Number if Axels in Ford Truck : "+axl);
		
	}
	@Override
	public int Calculation() {
		int div,sum,w,a;
		w =17000;
		a= 6;
		div=(w/500)*10;
		sum=(a*5)+div;
		System.out.println("Total Due : $"+sum);
		return sum;
	}
}


