class A
{
	static int i = 90;
	static
	{
		System.out.println("A-SIB");
	}
}

class B
{
	static void test()
	{
		System.out.println("from B.test");
	}
	static
	{
		System.out.println("B-SIB");
	}
}
class C
{
	static int i = 200;
	static int j = 500;
	static void test()
	{
	System.out.println("from C.test");
	}
	static
	{
		System.out.println("C-SIB");
	}
}

class E
{
	static
	{
		System.out.println("E-SIB");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("--------");
		System.out.println(C.i);
		System.out.println("--------");
		System.out.println(C.j);
		System.out.println("--------");
		B.test();
		System.out.println("--------");
		C.test();
		System.out.println("main end");
	}
}

/*
E-SIB
main begin
A-SIB
90
--------
C-SIB
200
--------
500
--------
B-SIB
from B.test
--------
from C.test
main end
*/