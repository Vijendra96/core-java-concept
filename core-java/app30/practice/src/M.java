class A
{
	A()
	{
		System.out.println("A()");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B()");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C()");
	}
}
class M
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		C c1 = new C();
		System.out.println("----------");
		B b1 = new B();
		System.out.println("----------");
		A a1 = new A();
		System.out.println("main end");
	}
}



/*

main begin
A()
B()
C()
----------
A()
B()
----------
A()
main end

*/