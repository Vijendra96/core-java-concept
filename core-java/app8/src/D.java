class D 
{
	public static void main(String[] args) 
	{
		System.out.println("main begins");
		if(args.length >= 1)
		{
			System.out.println(args[0]);
		}
		System.out.println("-------------------------");
		if(args.length >= 2)
		{
			System.out.println(args[0]);
			System.out.println(args[1]);
		}
		System.out.println("-------------------------");
		if(args.length >= 3)
		{
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
		}
		System.out.println("-------------------------");
		System.out.println("main end");
	}
}
