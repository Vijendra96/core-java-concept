class Q 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1(true);
		System.out.println("------------");
		test1(false);
		System.out.println("--------------");
		System.out.println("main end");
	}


	public static void test1(boolean flag)
	{
		System.out.println("test1 begin");
		if(flag)
		{
			return;
		}
		System.out.println("test1end");
	}
}
