package day4.activity5;

import java.util.*;

public class players {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrlist1 = new ArrayList<String>();
		List<String> arrlist2 = new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		
		System.out.print(" Enter the top 5 scorers of IPL Season 13");
		arrlist1.add(sc.nextLine());
		arrlist1.add(sc.nextLine());
		arrlist1.add(sc.nextLine());
		arrlist1.add(sc.nextLine());
		arrlist1.add(sc.nextLine());
		
		System.out.print("Enter the top 5 scorers of IPL Season 12 ");
		arrlist2.add(sc.nextLine());
		arrlist2.add(sc.nextLine());
		arrlist2.add(sc.nextLine());
		arrlist2.add(sc.nextLine());
		arrlist2.add(sc.nextLine());
		
		arrlist1.retainAll(arrlist2);
		
		System.out.println("Consistent run scorers");
		for (String a : arrlist1)
		System.out.println(a);
		
		
		

	}

}
