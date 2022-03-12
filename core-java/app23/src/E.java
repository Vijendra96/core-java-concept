class E 
{
	public static void test1() 
	{
		System.out.println("from test1()");
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
		test1();
		System.out.println("-----------------");
		test2();
		System.out.println("-----------------");
		test1();
		System.out.println("-----------------");
		test2();
		System.out.println("-----------------");
		test2();
		System.out.println("-----------------");
		test1();
		System.out.println("-----------------");
	}
	public static void test2() 
	{
		System.out.println("from test2()");
	}
}


/*

from main
from test1()
-----------------
from test2()
-----------------
from test1()
-----------------
from test2()
-----------------
from test2()
-----------------
from test1()
-----------------

*/