package day1;
import java.util.*; 
public class feedback{
	int feedbacks[];
	public void highestFeedBack(int medical[],int healthcare[],int size){
		int i,k,count=0,check=0;
		feedbacks = new int[2*size];
		for(i=0;i<size;i++)
		{
			for(k=0;k<count;k+=2)
			{
				if(feedbacks[k]==medical[i])
				{
					
				feedbacks[k+1]= (healthcare[i]>feedbacks[k+1])? healthcare[i]:feedbacks[k+1];
				check=1;
				}
			}
			if(check==0)
			{
            feedbacks[count]=medical[i];
        		   count++;
        	feedbacks[count]=healthcare[i];
        	count++;
			}
			
			check=0;
		}
		for(i=0;i<count;i++)
		{
			System.out.println(+feedbacks[i]);
		}
		
		
	}
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
	      int size = sc.nextInt();
	      if(size<0)
	      {
	    	  System.out.print("Invalid array size");
	    	  System.exit(0);
	      }
	      int[] medical = new int[size];
	      int[] healthcare = new int[size];
		     
	      for(int i=0; i<size; i++) {
	         medical[i] = sc.nextInt();
	         healthcare[i] = sc.nextInt();
	         if(medical[i]<0 || healthcare[i]<0  )
	         {
	        	 System.out.print("Invalid array size");
	        	 System.exit(0);
	         }
	      }
	     
	      
	      feedback ob = new feedback();
	      ob.highestFeedBack(medical, healthcare, size);
	      
	}
}