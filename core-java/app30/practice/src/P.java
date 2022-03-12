class P
{
	P()
	{
		this();
	}
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}

/*

P.java:3: error: recursive constructor invocation
        P()
        ^
1 error

*/