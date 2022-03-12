class K 
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
				System.out.println("this is from case 1");
				break;
			case 2:
				System.out.println("this is from case 2 ");
				break;
			case 3:
				System.out.println("this is from case 3");
				break;
			case 4:
				System.out.println("this is from case 4");
				break;
			case 5:
				System.out.println("this is from case 5");
				break;
			case 6:
				System.out.println("this is from case 6 ");
				break;
			case 7:
				System.out.println("this is from case 7");
				break;
			case 8:
				System.out.println("this is from case 8");
				break;

			case 9:
				System.out.println("this is from case 9");
				break;
			case 10:
				System.out.println("this is from case 10");
				break;
			default:
				System.out.println("this is not in range");

		}
	}
}
