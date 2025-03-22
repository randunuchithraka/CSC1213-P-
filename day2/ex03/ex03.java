import java.util.Scanner;
class ex03{
	public static void main(String[] args)
	{
		String fname;
		Scanner sc=new Scanner (System.in);
		
		
		System.out.println("enter your firstname:");
		fname=sc.nextLine();
		
		
		System.out.println("enter your last name:");
		String lname=sc.nextLine();
		
		System.out.println("enter your mark:");
		int mark=sc.nextInt();
		
 		System.out.println("fullname:"+fname+" "+lname+"\n"+"mark is:"+mark);
		}
}
		