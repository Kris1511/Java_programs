import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;
import org.junit.jupiter.api.*;

class CalculatorTest {
	
	int x, y, excepteRes;
	
	static Calculator c;
	
	// without method we can't create a object
	@BeforeAll
	static void getObject() {
		c = new Calculator();
	}
	
	@BeforeEach
	void setValues() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a x: ");		
		x = sc.nextInt();
		
		System.out.println("Enter a y: ");
		y = sc.nextInt();		
		
		System.out.println("Enter a excepted Result: ");
		excepteRes = sc.nextInt();
	}

	@Test
	void testAdd() {
//		int excepteRes = 15;
		
//		int actuallRes = Calculator.add(10, 5);  // without creating object 
		
//		assertEquals(excepteRes, actuallRes);
		
		// with creating object
//		Calculator c = new Calculator();
		
		int actuallRes = c.add(x, y);
		assertEquals(excepteRes, actuallRes, "Test case failed!!!");
	}

	@Test
	void testSub() {
//		int excepteRes = 5;
		int actuallRes = c.sub(x, y);
		assertEquals(excepteRes, actuallRes, "Test case failed!!!");
	}

	@Test
	void testMul() {
//		int excepteRes = 50;
		int actuallRes = c.mul(x, y);
		assertEquals(excepteRes, actuallRes, "Test case failed!!!");
	}

	@Test
	void testDiv() {
//		int excepteRes = 2;
		int actuallRes = c.div(x, y);
		assertEquals(excepteRes, actuallRes, "Test case failed!!!");
	}

}
