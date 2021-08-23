package day4.activity4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Run {

	public static void main(String[] args) throws NumberFormatException,ArithmeticException, IOException {
		// TODO Auto-generated method stub
		int runs_scored, overfaced;
		float run_rate;
		InputStreamReader r=new InputStreamReader(System.in);    
	     BufferedReader br=new BufferedReader(r);  
	     try{
	     System.out.print("Enter the total runs scored ");
	     
	     runs_scored=Integer.parseInt(br.readLine());
	     System.out.print("Enter the total overs faced ");
	     overfaced=Integer.parseInt(br.readLine());
	     
	     run_rate=(float)runs_scored/(float)overfaced;
	     System.out.print(" Current Run Rate :"  +run_rate);
	     }
	     catch(Exception e)
	     {
	    	 System.out.print(e);
	     }
	     
	     

	}

}
