class F1 
{
	public static void test1()
	{
		System.out.println("test1 begin");
		test2();
		System.out.println("test1 end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		test2();
		System.out.println("main end");
	}
	public static void test2()
	{
		System.out.println("test2 begin");
		test1();
		System.out.println("test2 end");
	}
}
