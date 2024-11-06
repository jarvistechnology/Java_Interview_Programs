package prabu.javaprograms;

public class Perfect {
	
	static boolean isPerfectNumber(int num)  
	{  
	
	int sum = 1;  
	
	for (int i = 2; i * i <= num; i++)  
	{  
	if (num % i==0)  
	{  
	if(i * i != num)  
	sum = sum + i + num / i;  
	else  
	
	sum = sum + i;  
	}  
	} 
	if (sum == num && num != 1)  
	
	return true;  
	
	return false;  
	} 
	
	
	
	public static void main (String args[])  
	{  
	System.out.println("Perfect Numbers between 2 to 100000 are: ");  
	
	for (int n = 2; n < 100000; n++)  
	
	if (isPerfectNumber(n))  
	
	System.out.println(n +" is a perfect number");  

}
}
