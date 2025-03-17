class bool{
	public static void main(String[] args)
	{
		boolean a=true;
		boolean b=false;
		System.out.println("logical operators");
		
		System.out.println("a&&b ="+(a&&b));
		System.out.println("a\\b=" +(a||b));
		System.out.println("!a=" + !a);
		
		
		int x=5;
		System.out.println("unary operators");
		
		System.out.println("x++ ="+ x++);
		System.out.println("x++ =" +x);
		System.out.println("++x =" + ++x);
		System.out.println("++x =" +x);
		
		
		
		int w=10,t=20;
		
		System.out.println("relational operators");
		System.out.println("w==t:"+(w==t));
		System.out.println("w!=t:"+(w=t));
		System.out.println("w<t:"+(w<t));
		System.out.println("w>t:"+(w>t));
		
		
		
		System.out.println("assignment operators");
		int l=10;
		l+=5;
		System.out.println("l+=5:"+l);
		l-=3;
		System.out.println("l-=5:"+l);
		
		
		System.out.println("ternary operators);
		int age=20;
		String result=(age>=20)?"adult:"minor";
		System.out.println("age"+age+"is:"+result);
		
		
		
		
		
		
		
		
		
		
	}
}