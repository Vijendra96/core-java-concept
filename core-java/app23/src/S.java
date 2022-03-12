class S 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	public static int test() 
	{
		System.out.println("from test end");
		return 10;
	}
}


/*
main begin
from test end
main end
*/