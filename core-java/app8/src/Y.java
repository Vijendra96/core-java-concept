class Y 
{
	public static void main(String[] args) 
	{
		if(args.length < 2)
		{
			System.out.println("pls supply two command line agrument. like bellow");
			System.out.println("java -cp ../classes Y <first_arg> <2nd_arg>");
			return;
		}
		String s1 = args[0];
		String s2 = args[1];
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		int sum = i + j;
		System.out.println("sum of " + i + " and " + j + " is " + sum);

	}
}
