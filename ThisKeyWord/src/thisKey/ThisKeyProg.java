package thisKey;

public class ThisKeyProg 
{

	int RollNo;
	String StudentName;
	double Percentage;
	
	public ThisKeyProg( String StudentName, int RollNo,  double Percentage)
	{
      this.RollNo = RollNo;                                  //RollNo = r;
      this.StudentName = StudentName;                       //StudentName = s;
      this.Percentage = Percentage;                        //Percentage = m;
	}
	
	public void print()
	{
		System.out.println("Student Name is: "+StudentName);
		System.out.println("Roll No is: "+RollNo);
		System.out.println("Percentage are: "+Percentage);
	}	
		public static void main(String[] args) 
		{
		
			ThisKeyProg x = new ThisKeyProg("Akshay", 20, 87.76);
			x.print();
			
		}
		
			
		

}
