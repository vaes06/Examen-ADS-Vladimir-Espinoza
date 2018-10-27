package SingleResponsibiliyPrinciple;

public class carfiances {
	double taxes = 1.30;
	
	public carfiances() {
		
	}
			
		
	double calculateMarketprice(car newcar) {
		double price = newcar.getPrice();
		double realprice = price*1.3;
		return realprice;	
		
			

	}

}
