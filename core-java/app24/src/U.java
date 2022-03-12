class U 
{
	static int i = test();
	//static int i = main(null);
	static int test()
	{
		System.out.println("test begin");
		main(null);
		System.out.println("test end");
		return 10;
	}


	public static void main(String[] args) 
	{
		System.out.println("from main:" + i);

	}
}
