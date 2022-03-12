class V
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
		   return;
		}
		System.out.println("from test end");
		
	}
}

/*
V.java:14: error: incompatible types: missing return value
                   return;
                   ^
1 error
*/