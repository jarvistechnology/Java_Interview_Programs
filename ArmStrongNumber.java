package interview.level1programs;

public class ArmStrongNumber {
	
	public static void singleArmstrong(int n) {
		
		int r=0;
		int sum=0;
		int temp=n;
		
		while(temp>0) {
			
			r = temp%10;
			
			temp=temp/10;
			
			sum=sum+(r*r*r);
		}
		
		if (sum==n) {
			System.out.println(n+" is an Armstrong Number");
		}
		
		else {
			
			System.out.println(n+" is not an Armstrong Number");
		}	
	}
	
	public static void armstrong() {
		
        int n;
        int r,sum = 0;
        System.out.println("Armstrong numbers from 1 to 1000:");
        for(int i = 1; i <= 1000; i++)
        {
            n = i;
            while(n > 0)
            {
                r = n % 10;
                n = n / 10;
                sum = sum + (r * r * r);
                
            }
            if(sum == i)
            {
                System.out.println(i);
            }
            sum = 0;
        }
	}
	
	public static void main(String[] args) {
		
		singleArmstrong(370);
		armstrong();
	}

}
