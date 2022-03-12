class Q
{
	Q()
	{
		System.out.println("Q()");
		this(90);
	}
	Q(int i)
	{
		System.out.println("T()");
	}
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}
/*
Q.java:6: error: call to this must be first statement in constructor
                this(90);
                    ^
1 error
*/