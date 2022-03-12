class K 
{
	static void test()
	{
		System.out.println("I am from test");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
		K.test();
		System.out.println("main end");
	}
}


/*
output:
main begin
I am from test
main end
I am from test
main end
*/