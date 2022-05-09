package mangoose.raji.oops.learning;

//class name should always starts with capital
public class Encapsulation {
	public String name;
	
	void getName() {
		this.name = "Rajima";
	}
	
	private void printName() {
		System.out.println(this.name);
	}
}
