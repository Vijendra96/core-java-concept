class D3 
{
	void test1()
	{
	}
	public static void test2()
	{
		test1();
	}
}

/*
G.java:10: error: non-static method test1() cannot be referenced from a static context
 test1();
 ^
1 error
 
8
*/

 ^
