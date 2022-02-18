package conditionalstatementsinjava;

public class IfStatement 
{

	public static void main(String[] args) {
		
		int marks= 35;
		if (marks >= 35 && marks >=30)
		
		
			System.out.println("Student is passed");
		    System.out.println("Hello");
		    
		 int pointer= 45;  
		 if (pointer >= 40);
		 
		 System.out.println("Student is failed");
		 
		 
		 // Check whether the number is even or odd?
		 
		 int x=20;
		 if (x%2==0)
		 
		 {
			 System.out.println("x is even");
		 }
		 
		 else
		 
		 {
			 System.out.println("x is odd");
		 }
		 
		 
		 
		 
		  
		//To find eligibility for blood donation: Nested if
		 
		 int Age= 25;
		 int Weight= 49;
		 
		 if (Age >= 18)
		 {
			 System.out.println("Check your weight now");
			 
			if (Weight >= 50)
			{
				System.out.println("You are eligible for Blood Donation");
			}
			else 
			{
				System.out.println("You are not eligible for blood donation");
			}
		 }
		 else
		 {
			System.out.println("You are underage for blood donation" );
		 }
		 System.out.println("End of Program");
		 
		  
		
	}
}
