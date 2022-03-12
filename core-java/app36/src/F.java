class F 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		//assert i < 10 :
		//assert i < 10 : test1();
		assert i < 10 : test2();
		System.out.println("main end");
	}
	static void test1()
	{
		System.out.println("from test1");
	}
	static int test2()
	{
		System.out.println("from test2");
		return 200;
	}
}

// calling test1() method will give compile time error becouse of 'void' type method, it return nothing.
//calling tesst2() method will compile and running also successful. 