class D2 
{
	void test() //non-static
	{
		System.out.println("from test");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}

/*
D.java:10: error: non-static method test() cannot be
referenced from a static context
 test();
 ^
1 error
*/


