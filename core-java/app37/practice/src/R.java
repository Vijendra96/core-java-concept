interface A
{
	void test1();
}
interface B extends A
{
	void test2();
}
class R implements B
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String[] args)
	{
		R obj = new R();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}
/*
		1. class to class is extends
		2. interface to interface is extends
		3. class to interface is implements
*/
