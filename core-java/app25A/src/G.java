class A
{
static int i = 90;
static
{
System.out.println("A-SIB");
}
static void test()
{
System.out.println("from A.test");
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
		static int i = 300;
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

class G
{
	static
	{
		System.out.println("G-SIB");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println(B.i);
		System.out.println("--------");
		C.test();
		System.out.println("--------");
		System.out.println(A.i);
		System.out.println("--------");
		System.out.println(C.j);
		System.out.println("--------");
		B.test();
		System.out.println("--------");
		C.test();
		System.out.println("--------");
		A.test();
		System.out.println("--------");
		System.out.println(C.i);
		System.out.println("main end");
	}
}

/*

G-SIB
main begin
B-SIB
300
--------
C-SIB
from C.test
--------
A-SIB
90
--------
500
--------
from B.test
--------
from C.test
--------
from A.test
--------
200
main end

*/