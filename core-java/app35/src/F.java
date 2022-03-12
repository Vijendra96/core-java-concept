//method overriding

abstract class A
{
	abstract void test1();
	void test2()
	{
		System.out.println("test2");
	}
}
class F extends A
{
	void test1()
	{
		System.out.println("from test1");
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.test1();
		f1.test2();
		System.out.println("Hello World!");
	}
}

/*

	abstract method overriding with the concrete menthod
	object creation is not possible of the abstract class

*/

/*

from test1
test2
Hello World!

*/
