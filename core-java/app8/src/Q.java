class Q 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
		    System.out.println("pls enter one int command line args");
			return;
		}
		String s1 = args[0];
		int i = Integer.parseInt(s1);
		double j = Math.sqrt(i);
		System.out.println("sqrt of " + i + " is " + j);
	}
}
