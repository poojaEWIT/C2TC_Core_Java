package basicjava;
import java.util.Scanner;
public class ThirdProgram {
		public static void main(String args[]) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the age");
			int age=sc.nextInt();
			
			if(age>=18)
			{
				System.out.println("u are eligible for voting");
				System.out.println("Bring ur voter id");
			}
			else
			{
				System.out.println("not eligible ");
				System.out.println("u need to wait for some more years");
				
			}
			System.out.println("vote for India");
			
		}

	}
