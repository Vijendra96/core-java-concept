class Z14 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Runnable t1 = test();
		System.out.println("main end : ");
	}
	static Runnable test()
	{
		System.out.println("I am from test");
		return null;
	}
}

/*

main begin
I am from test
main end :

*/