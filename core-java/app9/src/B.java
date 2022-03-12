class B 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("pls enter one int command line integer");
			return;
		}
		String s1 = args[0];
		int i = Integer.parseInt(s1);
		String s2 = Integer.toBinaryString(i);
		System.out.println("binary representation of " + i + " is "  + s2);
	}
}
