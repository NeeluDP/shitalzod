
public class BindEx1 {
	
	String text = "BindEx1's";
	void display() {
	System.out.println(text + " function called");
	}
	}
	
	class BindSubclass1 extends BindEx1 {
	void display() {
	super.display();
	text = "SubClass1's";
	System.out.println(text + " function called");
	}
	}
	
	class BindSubclass2 extends BindSubclass1 {
	void display() {
	super.display();
	
	text = "SubClass2's";
	System.out.println(text + " function called");
	}
	}
	
	class BindMainclass {
	public static void main(String args[]) {
	BindSubclass2 obj = new BindSubclass2();
	obj.display();
	}

}
