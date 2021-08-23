package day4.activity5;
import java.util.*;
public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("number of matches Gayle had played. ");
		Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
		List<Integer> arrlist1 = new ArrayList<Integer>();
		
		for(int i=0;i<size;i++)
		{
			arrlist1.add(sc.nextInt());
		}
		System.out.println(+Collections.frequency(arrlist1, 50));
		System.out.println(+Collections.frequency(arrlist1, 100));

	}

}
