class S
{
	S()
	{
		this(90);
	}
	S(int i)
	{
		this();
	}
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}
/*
Output:
S.java:3: error: recursive constructor invocation
 V()
 ^
*/