class E 
{
	public static void test(int i, String s1)
	{
		System.out.println("I am from test : " + i + ", " + s1);
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(450, 420);
		System.out.println("main end : ");
	}
}
