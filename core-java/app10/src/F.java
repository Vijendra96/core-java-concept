class F 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("pls enter two integer command line arguments");
			return;
		}
		String s1 = args[0];
		String s2 = args[1];

		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);

		System.out.println("bitwise or of " + i + " and " + j + " is " +(i|j));
		System.out.println("bitwise and of " + i + " and " + j + " is " +(i&j));
		System.out.println("bitwise xor of " + i + " and " + j + " is " +(i^j));
	}
}
