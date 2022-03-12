class O
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		if(args.length < 2)
		{
		System.out.println("pls supply two int command line arg");
		return;
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int min = i < j ? i : j;
		System.out.println("min value between " + i + " and " + j + " is " + min);
		System.out.println("main end");
	}
}
