class G 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		assert test1();
		//assert test2();
		System.out.println("main end");
	}
	static int test1()
	{
		System.out.println("from test1");
		return 200;
	}
	static boolean test2()
	{
		System.out.println("from test2");
		return true;
	}
}

//with assert we need a boolean value or boolean statement, otherwise it will give compiletime error