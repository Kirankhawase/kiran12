package java_imp;

public class Methodcalling {
	public static void m1() {
		System.out.println("m1 is static");
		
	}
   public static void m2() {
	   m1();
   }
   public static void main (String[]args) {
	   m2();
	   
   }
}
