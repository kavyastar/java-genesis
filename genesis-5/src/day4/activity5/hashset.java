package day4.activity5;
import java.util.*;
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		sc.nextLine();
		HashSet<String> ht=new HashSet<String> () ;
		for(int i=0;i<size;i++)
		{
			ht.add(sc.nextLine());
		}
		//System.out.print(ht);
		System.out.print(ht.size());
		

	}

}
