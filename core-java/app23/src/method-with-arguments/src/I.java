class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10, -10);
		System.out.println("main end : ");
	}
	static void test(int i, int j)
	{
		System.out.println("I am from test : " + i + ", " + j);
	}
}


/*

main begin
I am from test : 10, -10
main end :

*/