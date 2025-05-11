package Producer_consumer_pro_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory fact = new Factory();
		
		Producer p = new Producer(fact);
		
		Consumer c = new Consumer(fact);
		
		p.start();
		
		c.start();

	}

}
