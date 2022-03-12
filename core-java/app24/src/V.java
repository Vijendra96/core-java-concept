class V 
{
	static int i = test();
	//static int j = main(null);
	static int test()
	{
		System.out.println("test1:" + i);
		main(null);
		System.out.println("test2:" + i);
		i = 10;
		main(null);
		System.out.println("test3:" + i);
		return i + 10;

	}


	public static void main(String[] args) 
	{
		System.out.println("from main:" + i + ", "  + j);
		i += 5;
	}
}
