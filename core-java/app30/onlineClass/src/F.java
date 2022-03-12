class E
{
	int i;	//non static variable
	static int j;	//static variable
	void test1()	//non static method
	{
		System.out.println("from test1");
	}
	static void test2()	//static method
	{
		System.out.println("from test2");
	}
}
class F extends E 
{
	int m;	//non static variable
	static int n;	//static variable
	void test3()	//non static method
	{
		System.out.println("from test3");
	}
	static void test4()	//static method
	{
		System.out.println("from test4");
	}
	public static void main(String[] args) 
	{
		System.out.println(j + ", " + n);	//call static members
		test2();	//call static members
		test4();	//call static members
		F f1 = new F();
		System.out.println(f1.i + ", " + f1.m);
		f1.test1();
		f1.test3();
	}
}
/*
0, 0
from test2
from test4
0, 0
from test1
from test3
*/
