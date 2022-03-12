class P 
{
	static int i = test1();
	static int j = i + test2();
	static int test1()
	{
		System.out.println("I am from test - 1");
		return 10;
	}
	static int test2()
	{
		System.out.println("I am from test  - 2");
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(i + ", " + j);
		System.out.println("main end");
	}
}


/*
output:
I am from test - 1
I am from test  - 2
main begin
10, 30
main end
*/