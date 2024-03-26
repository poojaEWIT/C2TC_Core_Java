package basicjava;
import java.util.Scanner;
public class AssignmentQuestion2 {
		public String fullName;
		public int rollno;
		public String grade;
		public float percentage;
		public AssignmentQuestion2()
		{
			this.fullName=fullName;
			this.rollno=rollno;
			this.grade=grade;
			this.percentage=percentage;
		}
		public static void main(String[] args) 
		{	
				Scanner sc=new Scanner(System.in);
				System.out.println("enter ur full name ");
				String a=sc.next();
				
				System.out.println("enter rollno");
				int b=sc.nextInt();
				
				System.out.println("enter ur grade");
				String g=sc.next();
				
				System.out.println("enter ur percentage");
				float p=sc.nextFloat();
				
				System.out.println("check the given information is correct or not");
				System.out.println("name: \n"+a);
				System.out.println("rollno:\n"+b);
				System.out.println("grade: \n"+g);
				System.out.println("percentage: \n"+p);
				
				
			}
	}
