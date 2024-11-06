package prabu.javatrickyquestions;

public class Null_Argument {
	
	//We have overloaded functions and we are passing null. Which function will be called and what will be the output of the program?
	
	public static void foo(Object o) {
		System.out.println("Object argument");
	}
	public static void foo(String s) {
		System.out.println("String argument");
	}
	
//	public static void foo(StringBuffer i){
//		System.out.println("StringBuffer impl");
//	}
//	
	
	public static void main(String[] args) {
		foo(null);
	}

}
