package day4.activity4;

public class staticinner {
	
	 static class inner {
		 
		 public void my_method() {
	         System.out.println("This is static inner class");
	      }
		 
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticinner.inner v= new staticinner.inner();
		v.my_method();

	}

}
