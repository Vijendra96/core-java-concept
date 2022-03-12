class A
{
	A()
	{
		super();
		System.out.println("A()");
	}
}
class F extends A
{
	F()
	{
		super();
		System.out.println("F()");
	}
	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println("--------");
		F f1 = new F();
	}
}

/*

A()
--------
A()
F()

*/