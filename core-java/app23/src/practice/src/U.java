class U 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(test());		//error: 'void' type not allowed here
		System.out.println("main end");
	}
	public static void test()
	{
		System.out.println("I am from test");
	}
}
