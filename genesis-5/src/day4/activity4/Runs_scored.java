package day4.activity4;
import java.util.*;
public class Runs_scored {

	public static void main(String[] args) throws NegativeArraySizeException, ArrayIndexOutOfBoundsException{
		
		// TODO Auto-generated method stub
		int over,index;
		System.out.print("Enter the number of overs : ");
		Scanner in = new Scanner(System.in);
		try{
			over = in.nextInt();
			int [] runs = new int[over];
			System.out.print("Enter the number of runs for each over : ");
			for(int i=0;i<over;i++)
			{
				runs[i]=in.nextInt();
			}
		    System.out.print("Enter the over number : ");
		    index=in.nextInt();
		    System.out.print("Runs scored in this over : "+runs[index-1]);
		}
		catch(Exception e)
	     {
	    	 System.out.print(e);
	     }
		
		

	}

}
