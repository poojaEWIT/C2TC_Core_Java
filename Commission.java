package basicjava;
import java.util.Scanner;
public class Commission {
	public  String name;
	public String address;
	public int phone;
	public double sales_amount;

	Commission(){
		System.out.println("Student object is created");
		
	}
	public void accept(String name,String address,int phone,double sales_amount)
	{
		System.out.println("name:\n "+name+"\n address:\n "+address+"\n phone:\n"+phone+"\n sales_amount: \n"+sales_amount);
	}
	
	public void calculate(double sales_amount)
	{ 
		if (sales_amount>=100000)
			System.out.println("commission=10%");
		else if(50000<=sales_amount && sales_amount<100000)
			System.out.println("commission=5%");
		else if(30000<=sales_amount&&sales_amount<50000)
			System.out.println("commission=3%");
		
		else
			System.out.println("no commission");		    
		
	}
	public static void main(String[] args) {
		Commission c=new Commission();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter ur name");
		String g=sc.next();
		
		System.out.println("enter ur address");
		String a=sc.next();
		
		System.out.println("enter ur phoneno");
		int p=sc.nextInt();
		
		System.out.println("enter ur sales_amount");
		double s=sc.nextDouble();
		
		c.accept(g,a,p,s);
		c.calculate(s);
	}


}

