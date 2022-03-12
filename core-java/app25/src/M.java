class A 
{
	static int i;
	static
	{
		System.out.println("From SIB-A");
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
		System.out.println("From SIB-B");
	}
}

class M
{
	static
	{
		System.out.println("From SIB-M");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("-------------");
		System.out.println(A.i);
		System.out.println("-------------");
		B.test();
		System.out.println(A.i);
		System.out.println("---------------");
		System.out.println(A.i);
		System.out.println("---------------");
		B.test();
		System.out.println(A.i);
		B.test();
		System.out.println(A.i);
		System.out.println("main end");
	}
}


/*

From SIB-M
main begin
From SIB-A
0
-------------
0
-------------
From SIB-B
from B.test
0
---------------
0
---------------
from B.test
0
from B.test
0
main end



*/