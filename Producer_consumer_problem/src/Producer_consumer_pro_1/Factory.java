package Producer_consumer_pro_1;

public class Factory {
	
	int x;
	
	boolean presentData = false;
	
	public synchronized void produceData(int i) {
		
		try {
			
			if (presentData == true) {
				wait();
			} else {
				x = i;
				System.out.println("I have produced " + x + " in producer");
				presentData = true;
				notify();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public synchronized void consumerData() {
		
		try {
			
			if (presentData == false) {
				wait();
			} else {
				System.out.println("I have consumed " + x + " in cousumer");
				presentData = false;
				notify();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
