class X 
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("pls supply one command line agrument. like bellow");
			System.out.println("java -cp ../classes X <some_thing>");
			return;
		}
		System.out.println("your input is " + args[0]);
	}
}
