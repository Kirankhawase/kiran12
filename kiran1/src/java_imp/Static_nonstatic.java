package java_imp;

public class Static_nonstatic {
	public static void m2() {
		System.out.println("static method");
	}

	public void m1() {
		System.out.println("non static");
	}
	public static void main(String[]args) {
		Static_nonstatic ob = new Static_nonstatic();
		ob.m1();
		m2();
		
	}
}
