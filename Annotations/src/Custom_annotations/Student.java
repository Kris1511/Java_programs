package Custom_annotations;

public class Student {
	
	private String name;
	
	private int age;
	
	@setdata(agevalue = "Age is greater than 18")
	public void setAges(int age) {
		if (age >= 18) {
			this.age = age;
		}
		else {
			age = 0;
		}
	}

}
