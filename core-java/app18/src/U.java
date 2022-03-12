class U 
{
	public static void main(String[] args) 
	{
		if(args.length < 3)
		{
			System.out.println("pls enter 3 command line args. two are int numbers. one is operational symbol");
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		char c1 = args[2].charAt(0);
		switch(c1)
		{
			case '+':
				System.out.println("addition of " + i + " and " + j + " is " + (i + j));
				break;
			case '-':
				System.out.println("substraction of " + i + " and " + j + " is " + (i - j));
				break;
			case '*':
				System.out.println("multiplication of " + i + " and " + j + " is " + (i * j));
				break;
			case '/':
				System.out.println("division of " + i + " and " + j + " is " + (i / j));
				break;
			default:
				System.out.println("operation symbol is unvalid");
		}
	}
}
