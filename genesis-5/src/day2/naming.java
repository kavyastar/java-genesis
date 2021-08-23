package day2;
import java.util.*;
public class naming{
	
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		String first, last;
		first=in.nextLine();
		last=in.nextLine();
		
		System.out.print( first.substring(0, 1).toUpperCase()+first.substring(1).toLowerCase()+" " +last.toUpperCase());
	}
}