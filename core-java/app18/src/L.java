class L 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
		System.out.println("Please! enter one int command line argument");
		return;
		}
		String s1 = args[0];
		int i = Integer.parseInt(s1);
		switch(i)
		{
			case 1:
					System.out.println("happy monday");
					break;
			case 2:
					System.out.println("happy tuesday");
					break;
			case 3:
					System.out.println("happy wednesday");
					break;
			case 4:
					System.out.println("happy thursday");
					break;
			case 5:
					System.out.println("happy friday");
					break;
			case 6:
					System.out.println("happy saturday");
					break;
			case 7:
					System.out.println("happy sunday");
					break;
			default :System.out.println("Out of the range");

		}
	}
}
