class T 
{
	public static void main(String[] args) 
	{
		System.out.println("main bedin");
		int k = 100 + test();
		System.out.println("main end : " + k);
	}
	public static void test()
	{
		System.out.println("I am from test");
	}
}
