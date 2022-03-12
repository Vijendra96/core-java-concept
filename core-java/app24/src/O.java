class O 
{
	static int i = test();
	static int j = i + test();
	static int test()
	{
		System.out.println("I am from test");
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(i + ", " + j);
		System.out.println("main end");
	}
}
