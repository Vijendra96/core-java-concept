class C 
{
	static
	{
		System.out.println("SIB1");
	}
	static
	{
		System.out.println("SIB2 begin");
		test1();
		System.out.println("SIB2 end");
	}
	public static void test1()
	{
		System.out.println("from test1");
	}

	public static void main(String[] args) 
	{
		System.out.println("from main");
	}
}
