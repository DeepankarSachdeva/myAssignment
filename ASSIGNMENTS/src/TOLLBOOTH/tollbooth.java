package TOLLBOOTH;

public class tollbooth {

	
		public int FORDdisplay() {
			int r3;
			System.out.println("****Arrival Of FORD TRUCK****");
		FordTruck f1=new FordTruck();
		f1.Weight();
		f1.Axel();
		r3=f1.Calculation();
		return r3;
		}
		public int Nissandisplay() {
			int r2;
			System.out.println("****Arrival Of NISSAN TRUCK****");
			Nissan n1=new Nissan();
		n1.Weight();
		n1.Axel();
		r2=n1.Calculation();
		return r2;
		}
		public int Daewoodisplay() {
			int r1;
			System.out.println("****Arrival Of Daewoo TRUCK****");
			Daewoo d1=new Daewoo();
		d1.Weight();
		d1.Axel();
		r1=d1.Calculation();
		return r1;
		}
		
	/*	public void totall()
		{int SUM;
			SUM=r1+r2+r3;
			System.out.println("****Collection Reciepts****");
			System.out.print("Total Since the Last Collection");
			System.out.println("-Receipts : $"+SUM+" Truck: 3");
			System.out.println("****Reset Reciepts****");
			int Reset=SUM-SUM;
			System.out.print("Total Since the Last Collection-");
			System.out.println("Receipts :$"+Reset+" Truck :"+Reset);
					
		} */

}

