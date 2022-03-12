abstract class A
{
	abstract void test1();
	void test2()
	{
		System.out.println("from test2");
	}
	void test3()
	{
		System.out.println("from test3");
	}
	void test4()
	{
		System.out.println("from test4");
	}
}
class G extends A
{
	void test1()
	{
		System.out.println("from test1");
	}
	public static void main(String[] args) 
	{
		G g1 = new G();
		g1.test1();
		System.out.println("Hello World!");
	}
}
/*
from test1
Hello World
*/

/*
		test1() of subclass G, overriding the abstarct test1() method, its called method overriding
*/