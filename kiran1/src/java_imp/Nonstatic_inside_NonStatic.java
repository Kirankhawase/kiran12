package java_imp;

public class Nonstatic_inside_NonStatic {
	public void m1() {
		System.out.println("m1 is non static");
	}

	public void m2() {
		m1();

	}

	public static void main(String[] args) {
		NonStatic_inside_static ob = new NonStatic_inside_static();
		ob.m2();
	}

}
