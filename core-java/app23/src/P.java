class P 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	public static void test() 
	{
		System.out.println("from test begin");
		if(true)
		{
			System.out.println("from if block");
			return;
		}
		System.out.println("from test end");
	}
}


/*

	main begin
	from test begin
	from if block
	main end

*/