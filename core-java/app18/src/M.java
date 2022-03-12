class M 
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
				switch(i<=17)
				{				
					System.out.println("hyou are a child");
				}
			case 2:
					if(i>=18)
				{
					System.out.println("hyou are aa adult");
				}
					break;
			
			default:
				if(i>=70)
				{
					System.out.println("hyou are an old");
				}
		}
	}
}
