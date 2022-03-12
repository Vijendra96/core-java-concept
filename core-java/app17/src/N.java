class N
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		if(args.length < 1)
		{
			System.out.println("pls supply one int command line arg");
			return;
		}
			int age = Integer.parseInt(args[0]);
			String msg = age < 19 ? "child" : "adult";
			System.out.println("Your age is : " + age + " and you are : " + msg);
			System.out.println("main end");
	}
}