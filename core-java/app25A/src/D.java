class A
{
	static int i = 90;
}

class B
{
	static void test()
	{
		System.out.println("from B.test");
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
}

class D
{
	public static void main(String[] args)
	{
		System.out.println(A.i);
		System.out.println(C.i);
		System.out.println(C.j);
		B.test();
		C.test();
	}
}

/*

90
200
500
from B.test
from C.test

*/