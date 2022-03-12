class H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10, true);
		System.out.println("main end : ");
	}
	static void test(int i, int j)
	{
		System.out.println("I am from test : " + i + ", " + j);
	}
}


/*

compilation error

*/