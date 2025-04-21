package Singleton_pattern;

//Singleton_pattern.PrimeMinister@5e265ba4
//Singleton_pattern.PrimeMinister@5e265ba4

public class IndianApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the object
		PrimeMinister pm = PrimeMinister.getObject();
		System.out.println(pm);		// we can get the same address
		
		// creating another object
		PrimeMinister pm2 = PrimeMinister.getObject();
		System.out.println(pm2);	// we can get the same address

	}

}
