package TOLLBOOTH;

public class TestTollBooth {

	public static void main(String[] args) {
		
		System.out.println("******WELCOM TO ALLEGHENEY TOLLBOOTH******");
		System.out.println("-----------------------------------------------");
		tollbooth obj1=new tollbooth();
		int r1,r2,r3;
		r1=obj1.FORDdisplay();
		System.out.println("-----------------------------------------------");
		r2=obj1.Nissandisplay();
		System.out.println("-----------------------------------------------");

		r3=obj1.Daewoodisplay();
		System.out.println("-----------------------------------------------");
		int SUM;
		SUM=r1+r2+r3;
		System.out.println("****Collection Reciepts****");
		System.out.print("Total Since the Last Collection");
		System.out.println("-Receipts : $"+SUM+" Truck: 3");
		System.out.println("-----------------------------------------------");

		System.out.println("****Reset Reciepts****");
		int Reset=SUM-SUM;
		System.out.print("Total Since the Last Collection-");
		System.out.println("Receipts :$"+Reset+" Truck :"+Reset);
				
		
		

	}

}
