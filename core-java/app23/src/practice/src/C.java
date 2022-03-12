class C 
{
	public static void test(int i)
	{
		System.out.println("I am from test : " + i);
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(true);
		System.out.println("main end : ");
	}
	
}
