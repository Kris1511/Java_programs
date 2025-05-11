import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

//data testing
//Before each data testing
//test 3
//After each data testing
//Before each data testing
//test 1
//After each data testing
//Before each data testing
//test 2
//After each data testing
//After data testing

class TestCalculator {
	
	@BeforeAll
	static void testData() {
		System.out.println("data testing");
	}
	
	@AfterAll
	static void testData2() {
		System.out.println("After data testing");
	}
	
	@BeforeEach
	void beforeData() {
		System.out.println("Before each data testing");
	}
	
	@AfterEach
	void afterData() {
		System.out.println("After each data testing");
	}

	@Test
	void test1() {
		System.out.println("test 1");
	}
	
	@Test
	void test2() {
		System.out.println("test 2");
	}
	
	@Test
	void tes3() {
		System.out.println("test 3");
	}

}
