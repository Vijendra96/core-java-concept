class O 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("pls enter one command line argument");
		    return;
		}
		System.out.println("you have supplied these command line arguments");
		for(String s1 : args)
		{
			System.out.print(s1 + ", ");
		}
	}
}
