class E
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10);
		System.out.println("main end : ");
	}
	static void test(int i)
	{
		System.out.println("I am from test : " + i);
	}
}

/*

main begin
I am from test : 10
main end : 

*/