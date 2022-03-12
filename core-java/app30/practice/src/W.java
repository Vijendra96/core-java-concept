class A
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		this();
		System.out.println("A(int)");
	}
	{
		System.out.println("A-IIB");
	}
}
class B extends A
{
	B()
	{
		this(90);
		System.out.println("B()");
	}
	B(int i)
	{
		System.out.println("B(int)");
	}
	{
		System.out.println("B-IIB");
	}
}
class W
{
	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println("--------");
		A a2 = new A(10);
		System.out.println("--------");
		B b1 = new B();
		System.out.println("--------");
		B b2 = new B(20);
	}
}
/*

A-IIB
A()
--------
A-IIB
A()
A(int)
--------
A-IIB
A()
B-IIB
B(int)
B()
--------
A-IIB
A()
B-IIB
B(int)

*/