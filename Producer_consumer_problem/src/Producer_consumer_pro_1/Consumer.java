package Producer_consumer_pro_1;

public class Consumer extends Thread {
	
	Factory ref;
	
	public Consumer(Factory ref) {
		this.ref = ref;
	}
	
	public void run() {
		
		while (true) {
			ref.consumerData();
		}
	}

}
