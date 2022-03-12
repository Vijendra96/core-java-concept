class D 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("pls enter the binary number");
			return;
		}
		String binary = args[0];
		int i = Integer.parseInt(binary,2);
		System.out.println("inter value of " + binary + " is " + i);
	}
}
