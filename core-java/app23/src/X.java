class X
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end ");
	}
	public static int test() 
	{
		System.out.println("from test begin");
		if(true)
		{
		   return 1000;
		}
		System.out.println("from test end");
		return 200;	
	}
}


/*

main begin
from test begin
main end

*/