package java_imp;

public class static_iside_nonstatic {
	public static void m1() {
		System.out.println("m1 is static");
		
	}
   public void m2() {
	   m1();
	   
   }
   public static void main(String[] args) {
	   static_iside_nonstatic ob = new static_iside_nonstatic();
	   ob.m2();
}
}
