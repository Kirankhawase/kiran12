package java_imp;

public class NonStatic_inside_static {
 public void m1() {
	 System.out.println("m1 is non static ");
	 
 }
 public static void m2() {
	 NonStatic_inside_static ob = new NonStatic_inside_static() ;
	 ob.m1();
	 }
 public static void main(String[]args) {
	 m2();
	 
 }
 }


