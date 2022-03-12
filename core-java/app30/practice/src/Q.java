class A
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B()");
	}
	B(int i)
	{
		System.out.println("B(int)");
	}
}
class Q
{
	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println("---------");
		A a2 = new A(20);
		System.out.println("---------");
		B b1 = new B();
		System.out.println("---------");
		B b2 = new B(20);
		System.out.println("---------");
	}
}

/*

A()
---------
A(int)
---------
A()
B()
---------
A()
B(int)
---------

*/