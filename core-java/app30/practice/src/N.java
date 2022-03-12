class A
{
	A()
	{
		System.out.println("A()");
	}
}
class N extends A
{
	N()
	{
		System.out.println("N()");
		super();
	}
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}

/*

N.java:13: error: call to super must be first statement in constructor
                super();
                     ^
1 error

*/