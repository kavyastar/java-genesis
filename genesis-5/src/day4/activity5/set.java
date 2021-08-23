package day4.activity5;
import java.util.*;
public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		scan.nextLine();
		TreeSet<String> tree=new TreeSet<String>();
		for(int i=0;i<size;i++)
		{
			
			tree.add(scan.nextLine());
			
		}
		for(String a:tree){
			System.out.println(a);
		}
		

	}

}
