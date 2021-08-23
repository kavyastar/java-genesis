package day1;
import java.util.Scanner;
public class salary
{
	public int calculateSal(int salary, int shifts) 
	{int savings;
		
			savings = (int)((salary*0.5)+(salary*0.02*shifts));
		    return savings;
	   
	}
	
	public static void main(String[] args)
	{	int salary=0,shifts=0;
		//double savings=0;
		Scanner in=new Scanner(System.in);
		salary = in.nextInt();
		shifts = in.nextInt();
		if(salary > 8000)
		{System.out.print("Salary too large ");
		System.exit(0);
		}
		else if(shifts<0)
			{System.out.print ("Shifts too small\n");
			System.exit(0);
			}
		else if(salary<0)
		{
			System.out.print ("Salary too small");
			System.exit(0);
		}
		salary s= new salary();
		int p= s.calculateSal(salary, shifts);
		if(p!=0)
		{
			System.out.print(+p);
		}
		
		
	}
}