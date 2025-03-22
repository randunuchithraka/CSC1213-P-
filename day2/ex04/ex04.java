import java.util.Scanner;
class ex04{
	public static void main(String[] args)
	
	{
		
		String name,Reg_no;
		int age;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name:");
		name=sc.nextLine();
		
		System.out.println("enter your Reg_no:");
		Reg_no=sc.nextLine();
		
		System.out.println("enter your age:");
		age=sc.nextInt();
		
		
		System.out.println("enter your sex:");
		char sex=sc.next().charAt(0);
		
		System.out.println("enter your p_no:");
		long p_no=sc.nextLong();
		
		System.out.println("enter your gpa:");
		double gpa=sc.nextDouble();
		
		
		System.out.println("fullname:"+name+"\n"+"Reg_no:"+Reg_no+"\n"+"age:"+age+"\n"+"sex:"+sex+"\n"+"p_no:"+p_no+"\n"+"gpa:"+gpa);
		
	}
}
		
		
		
		
		
		
		
		
		
		