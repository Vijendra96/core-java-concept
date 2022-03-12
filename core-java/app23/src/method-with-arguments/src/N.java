class N
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		int j = test(++i);
		System.out.println("main end : " + i + " and " + j); 
	}
	static int test(int x)
	{
		System.out.println("I am from test : " + x); 
		x = x + 500; 
		System.out.println("i am from test : " + x); 
		return x;
	}
}


/*

main begin
I am from test : 2
i am from test : 502
main end : 2 and 502

*/