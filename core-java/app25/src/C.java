class C 
{
	static int i = test();

	static 
	{
		System.out.println("SIB");
	}

	static int test()
	{
		System.out.println("test");
		return 0;
	}


	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}


/*

test
SIB
main

*/