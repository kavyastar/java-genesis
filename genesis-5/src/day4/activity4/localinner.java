package day4.activity4;

public class localinner {
	
	
		private void getValue()
		{
			
			final int sum = 20;
			
			// Local inner Class inside method
			class Inner
			{
				
				
				private String gethai()
				{
					
					return "hai";
				}
			}
			
			Inner inner = new Inner();
			System.out.println("Inner function :  "+ inner.gethai());
			
		}
		
		public static void main(String[] args)
		{
			localinner outer = new localinner();
			outer.getValue();
		}
	


}
