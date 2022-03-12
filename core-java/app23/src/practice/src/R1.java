class R1 
{
	public static void calculateAge(int yearOfBirth)
	{
		if(yearOfBirth >= 2022)
		{
			System.out.println("pls supply command line argument as less than 2022");
			return;
		}
		int age = 2022 - yearOfBirth;
		System.out.println("you age is :" + age);
	}
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("pls supply one command line argument");
			return;
		}
		int yearOfBirth = 0;
		try
		{
			yearOfBirth = Integer.parseInt(args[0]);
		}
		catch (NumberFormatException ex)
		{
			System.out.println("pls supply one int command line argument");
			return;
		}
		calculateAge(yearOfBirth);
	}
}
