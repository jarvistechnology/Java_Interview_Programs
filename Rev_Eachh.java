package prabu.javaprograms;

public class Rev_Eachh {
	
	public static void main(String[] args) {
		
	String str ="Hello Java";
	
	String[] allword = str.split(" ");
	
	String rStr ="";
	
	for (String word : allword) {
	    String rev ="";
	    
	    for (int i=0; i <word.length(); i++) {
	    	
	        rev = word.charAt(i)+rev;
	    }
	    
	    
	    rStr =rStr+" "+ rev;
	}
	
	String revStr = rStr.substring(1);
	
	System.out.println(revStr); 

}
}