class D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10);
		System.out.println("main end : ");
	}
	static void test(int i)
	{
		System.out.println("I am from test");
	}
}


/*

main begin
I am from test
main end :

*/