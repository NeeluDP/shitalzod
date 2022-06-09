
public class Overload {
	
	void demo(int a) {
		System.out.println("a: " + a);
		}
		void demo(int a, int b) {
		System.out.println("a and b: " + a + "," + b);
		}
		double demo(double a) {
		System.out.println("double a: " + a);
		return a * a;
		}
		
		int demo(int a, int b, int c) {
		return a + b + c;
		}
		}
		
		class MethodOverloading {
		public static void main(String[] args) {
		Overload Obj = new Overload();
		double result;
		int add;
		Obj.demo(10);
		Obj.demo(10, 20);
		result = Obj.demo(5.5);
		System.out.println("O/P : " + result);
		add = Obj.demo(5, 5, 5);
		System.out.println("O/P : " + add);
		}
		}
		


