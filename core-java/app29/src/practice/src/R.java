class R
{
	void test()
	{
		this();
		System.out.println("test");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}
/*
R.java:6: error: call to this must be first statement in constructor
                this();
                    ^
1 error
*/