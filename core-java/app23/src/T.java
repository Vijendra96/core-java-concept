class T 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		boolean i = test();
		System.out.println("main end");
	}
	public static int test() 
	{
		System.out.println("from test end");
		return 10;
	}
}


/*

T.java:6: error: incompatible types: int cannot be converted to boolean
                boolean i = test();
                                ^
1 error

*/