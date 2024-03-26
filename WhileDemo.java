package basicjava;
import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of i");
		i=sc.nextInt();
		
		do
		{
			System.out.println("i="+i);
			i++;
		}while(i<100);
		
	}
}