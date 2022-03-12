class Z 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(test() + test() + " addition ");
		System.out.println("main end");
	}
	public static int test()
	{
		System.out.println("I am from test");
		return 150;
	}
}
