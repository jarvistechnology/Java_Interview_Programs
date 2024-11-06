package prabu.javaprograms;

public class Rev_Each {
	
public static void main(String[] args) {
	
	String s="Hello Java";

	
	String sn="";
	
	
	for (int i = 0; i <s.length(); i++) {
		
		sn=s.charAt(i)+sn;
		
		
		
	}
		
	System.out.println(sn);
}


}
