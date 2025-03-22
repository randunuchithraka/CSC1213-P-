import java.util.Date;
import java.util.Random;

class ex06{
	public static void main(String[] args)
	{
		System.out.println(Math.max(5,10));
		System.out.println(Math.min(2,10));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.abs(-4.7));
		System.out.println(Math.round(5.6));
		
		String name="java";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		
		int num01=Integer.parseInt("100");
		double num02=Double.parseDouble("45.67");
		System.out.println(num01+num02);
		
		/*Random r=new Random();
		int num=r.nextInt(10);*/
		
		
		Date d =new Date();
		System.out.println(d);
		
	}
}

		
		
		

		
