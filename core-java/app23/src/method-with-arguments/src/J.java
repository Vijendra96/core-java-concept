class J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		test(i);
		System.out.println("main end : " + i);
	}
	static void test(int i)
	{
		System.out.println("I am from test : " + i);
		i = 2;
	}
}


/*

main begin
I am from test : 1
main end : 1

*/