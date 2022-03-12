class Z5 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	static char test()
	{
		System.out.println("from test");
		return 'd';
	}
}

/*

main begin
from test
main end

*/