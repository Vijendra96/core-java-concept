class I 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(args.length < 1)
		{
			System.out.println("Please! enter one int command line argument");
			return;
		}
		int i = Integer.parseInt(args[0]);
		switch(i)
		{
			case 1:
			System.out.println("from case1");
			break;

			case 3:
			System.out.println("from case3");

			System.out.println("from case3");
			break;

			default:
			System.out.println("from default........");
			break;

			case 7:
			{
			System.out.println("from case7");
			break;
			}

			case 10:
			{
			System.out.println("from case10");
			break;
			}
		}
		System.out.println("main end");
		
	}
}
