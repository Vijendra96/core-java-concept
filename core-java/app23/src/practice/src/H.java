class H 
{
	public static void test(int i, int j)
	{
		System.out.println("I am from test i = " + i + " and  j = " + j);
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(420, "abc");
		System.out.println("main end ");
	}
}
