class Z6 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		boolean b1 = test();
		System.out.println("main end");
	}
	static char test()
	{
		System.out.println("from test");
		return 'd';
	}
}

/*

compialation error

*/