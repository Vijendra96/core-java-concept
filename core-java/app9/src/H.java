class H 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("pls enter the int command line args");
		}
		String s1 = args[0];
		String s2 = args[1];
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);

		System.out.println("Binary String is of " + i + " is " + Integer.toBinaryString(i));
		System.out.println("Binary String is of " + j + " is " + Integer.toBinaryString(j));
	}
}
