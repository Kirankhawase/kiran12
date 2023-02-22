package java_imp;

public class Local_nostatic_static_var {
	int a1;//non static
	public static void main(String[]args) {
		int a =20;//static becus its inside method
		System.out.println(a);
		
		Local_nostatic_static_var  var= new Local_nostatic_static_var();
		System.out.println(var.a1);
		
	}

}
