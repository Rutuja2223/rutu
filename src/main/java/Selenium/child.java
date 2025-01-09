package Selenium;

public class child extends Parent
	{
		int parenti=20;
		public void Childm1()
		{
			System.out.println("This is child class--"+this.parenti);   //20
			System.out.println("This is Parent class--"+super.parenti);  //10
			
		}
		
		public void Parentm1()
		{
			System.out.println("This is parent class--"+super.parenti);//10
		}
	
	public static void main(String[] args)
	{
		Parent p1=new Parent();
		p1.Parentm1();  //10
		
		
		child c1=new child();
		c1.Childm1();	//20 10
		c1.Parentm1();	//10


		
	
		
		

	}

}
