class N 
{
	static int i = test();
	static int test()
	{
		System.out.println("I am from test");
		return 200;
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
		i = 500;
		System.out.println(i);
	}
}
