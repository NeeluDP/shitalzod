
public class BindDynamic {
	
	protected String val;
	void display(String str) {
	val = "Base Class Fuction ".concat(str);
	System.out.println(val);
	}
	}
	
	class BindDynamicSubclass extends BindDynamic {
	void display(String str) {
	if (val == null) {
	str = "Derived Class Fuction ".concat(str);
	System.out.println(str);
	}
	}
	}
	
	class BindDynamicMainClass {
		
	public static void main(String args[]) {
		
	BindDynamicSubclass obj = new BindDynamicSubclass();
	
	obj.display("Called");	

}}
