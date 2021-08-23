package day3;

import java.util.Scanner;

public abstract class Match {
	
	private int currentscore,target;
	private float currentover;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public abstract double calculateRunRate();
	public abstract int calculateBalls();
	public abstract void display(double reqRunrate, int balls);
	
}
class ODIMatch extends Match{

	@Override
	public double calculateRunRate() {
		int k=0;
		float  f=this.getCurrentover();
		String s=String.valueOf(f);  
		String[] arrOfStr = s.split("\\.");
        int d= 50 - Integer.parseInt(arrOfStr[0]);
        //int k= 6-Integer.parseInt(arrOfStr[1]);
        double over_left=d+(0.1*k);
        int rem_run=this.getTarget()-this.getCurrentscore();
		return  rem_run/over_left;
	}

	@Override
	public int calculateBalls() {
		float  f=this.getCurrentover();
		String s=String.valueOf(f);  
		String[] arrOfStr = s.split("\\.");
		int k=0;
        int d= 50 - Integer.parseInt(arrOfStr[0]);
        
        // k= 6-Integer.parseInt(arrOfStr[1]);
		
		return (d*6)+k;
	}

	@Override
	public void display(double reqRunrate, int balls) {
		// TODO Auto-generated method stub
		int run= this.getTarget()-this.getCurrentscore();
		System.out.println(" Need "+run+ " runs in "+balls+" balls \nRequired Runrate: "+reqRunrate);
		
		
	}
	
}
class TestMatch extends Match{

	@Override
	public double calculateRunRate() {
		int k=0;
		float  f=this.getCurrentover();
		String s=String.valueOf(f);  
		String[] arrOfStr = s.split("\\.");
        int d= 90 - Integer.parseInt(arrOfStr[0]);
        //int k= 6-Integer.parseInt(arrOfStr[1]);
        double over_left=d+(0.1*k);
        int rem_run=this.getTarget()-this.getCurrentscore();
		return  rem_run/over_left;
	}

	@Override
	public int calculateBalls() {
		float  f=this.getCurrentover();
		String s=String.valueOf(f);  
		String[] arrOfStr = s.split("\\.");
		int k=0;
        int d= 90 - Integer.parseInt(arrOfStr[0]);
        
        // k= 6-Integer.parseInt(arrOfStr[1]);
		
		return (d*6)+k;
	}

	@Override
	public void display(double reqRunrate, int balls) {
		// TODO Auto-generated method stub
		int run= this.getTarget()-this.getCurrentscore();
		System.out.println(" Need "+run+ "runs in "+balls+" balls \nRequired Runrate: "+reqRunrate);
		
	}
}
class T20Match extends Match{

	@Override
	public double calculateRunRate() {
		// TODO Auto-generated method stub'
		int k=0;
		float  f=this.getCurrentover();
		String s=String.valueOf(f);  
		String[] arrOfStr = s.split("\\.");
        int d= 20 - Integer.parseInt(arrOfStr[0]);
        //int k= 6-Integer.parseInt(arrOfStr[1]);
        double over_left=d+(0.1*k);
        int rem_run=this.getTarget()-this.getCurrentscore();
		return  rem_run/over_left;
		
				
	}

	@Override
	public int calculateBalls() {
		// TODO Auto-generated method stub
		float  f=this.getCurrentover();
		String s=String.valueOf(f);  
		String[] arrOfStr = s.split("\\.");
		int k=0;
        int d= 20 - Integer.parseInt(arrOfStr[0]);
        
        // k= 6-Integer.parseInt(arrOfStr[1]);
		
		return (d*6)+k;
	}

	@Override
	public void display(double reqRunrate, int balls) {
		// TODO Auto-generated method stub
		int run= this.getTarget()-this.getCurrentscore();
		System.out.println(" Need "+run+ " runs in "+balls+" balls \nRequired Runrate: "+reqRunrate);
		
	}
}
class MatchMain {
	public static void main(String []srgs)
	{
		System.out.println(" Sample Input and Output: \nEnter the match format\n1. ODI\n2. T20\n3. Test");
		int type;
		Scanner sc=new Scanner(System.in);
		type= sc.nextInt();
		int currentscore,target;
		float currentover; 
		System.out.println("Enter the Current score");
		currentscore=sc.nextInt();
		System.out.println("Enter the current Over ");
		currentover=sc.nextFloat();
		System.out.println("Enter the Target Score");
		target=sc.nextInt();
		int run,ball;
		float rate;
		double req_run;
		run= target-currentscore;
		 if (type==1)
		 {//50
			 ODIMatch o = new ODIMatch();
			 o.setCurrentover(currentover);
			 o.setCurrentscore(currentscore);
			 o.setTarget(target);
			 ball=o.calculateBalls();
			 req_run=o.calculateRunRate();
			 o.display(req_run, ball);
			
		 }
		 else if(type==2)
		 {//20
			 T20Match  t2 = new T20Match();
			 t2.setCurrentover(currentover);
			 t2.setCurrentscore(currentscore);
			 t2.setTarget(target);
			 ball =t2.calculateBalls();
			 req_run=t2.calculateRunRate();
			 t2.display(req_run, ball);
			 
		 }
		 else{
			 //90
			 TestMatch t = new TestMatch();
			 t.setCurrentover(currentover);
			 t.setCurrentscore(currentscore);
			 t.setTarget(target);
			 ball=t.calculateBalls();
			 req_run=t.calculateRunRate();
			 t.display(req_run, ball);
		 }
		
	}
}
