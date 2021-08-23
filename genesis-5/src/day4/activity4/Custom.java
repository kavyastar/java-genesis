package day4.activity4;

import java.util.Scanner;

public class Custom {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		String name;
		int age;
		System.out.print("Enter the player name  : ");
		Scanner sc=new Scanner(System.in);
           name=sc.next();
          System.out.print("Enter the player age : ");
          age=sc.nextInt();
          if(age<19)
          {
        	  throw new CustomException();
          }
          else{
        	  System.out.print(" Player name : "+name+" Player age : "+age);
          }
        	   
           
	}

}

