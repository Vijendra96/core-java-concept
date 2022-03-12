class H 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
class H 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("pls enter two integer command line arguments");
			return;
		}
		String s1 = args[0];
		String s2 = args[1];
		String s3 = args[2];
		String s4 = args[3];
		String s5 = args[4];
		String s6 = args[5];

		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		int k = Integer.parseInt(s3);
		int l = Integer.parseInt(s4);
		int m = Integer.parseInt(s5);
		int n = Integer.parseInt(s6);

		System.out.println("bitwise or of " + i + " and " + j + " is " +(i|j));
		System.out.println("bitwise and of " + k + " and " + l + " is " +(k&l));
		System.out.println("bitwise xor of " + m + " and " + n + " is " +(m^n));
		
	}
}
