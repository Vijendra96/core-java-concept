class D //non-static variable
{
	void test1()
	{

	}
	static void test2()
	{
		test1();
	}
}







/*

 error: non-static method test1() cannot be referenced from a static context
                test1();
                ^
*/