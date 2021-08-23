package day4.activity4;

public class CustomException extends Exception  
{  
    public CustomException ()  
    {  
        // calling the constructor of parent Exception  
        super();  
        System.out.print(" InvalidAgeRange");
    }  
}  