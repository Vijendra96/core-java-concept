class Z11 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String d1 = test();
		System.out.println("main end : " + d1);
	}
	static String test()
	{
		System.out.println("I am from test");
		return "abc";
	}
}

/*

main begin
I am from test
main end : abc

*/