class W
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
		   return true;
		}
		System.out.println("from test end");
	}
}


/*

W.java:14: error: incompatible types: boolean cannot be converted to int
                   return true;
                          ^
1 error

*/