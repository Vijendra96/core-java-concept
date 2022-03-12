class L 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("please supply one command line args");
			return;
		}
		int age = Integer.parseInt(args[0]);
		if(age <= 0)
		{
			System.out.println("age is invalid");
			return;
		}
		System.out.println("continue........");
		System.out.println("continue........");
		System.out.println("continue........");
	}
}