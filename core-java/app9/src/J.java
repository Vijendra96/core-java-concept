class J 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("pls enter the int command line args");
		}
		String s1 = args[0];
		String s2 = args[1];
		int i = Integer.parseInt(s1,2);
		int j = Integer.parseInt(s2,2);
		System.out.println("Decimal value of " + s1 + " is " + i);
		System.out.println("Decimal value of " + s2 + " is " + j);
	}
}
