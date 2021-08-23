package day1;
import java.util.*; 
public class car {
	
	public int productDigits(int num)
	{
		int pr=1,temp,product=1;
		if (num>-1 && num <32767)
		{
		while(num!=0)
		{
			temp=num%10;
			product=product*temp;
			num=num/10;
		}
		return product;
		}
		else
			return -1;
	}
	public static void main(String[] args)
	{
		int km,product;
		Scanner in = new Scanner(System.in);
		km= in.nextInt();
		car n = new car();
		int val = n.productDigits(km);
		if(val>-1)
		{
			System.out.print(+val);
		}
		else{
			System.out.print("Invalid Input");
		}
	}
}