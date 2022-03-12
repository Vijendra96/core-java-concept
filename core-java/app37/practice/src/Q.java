interface A
{
	void test1();
}
interface B
{
	void test2();
}
class Q implements A, B
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
		Q obj = new Q();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}
/*
		1. class can implement any number of super interfaces. its a multiple inheritance.
		2. java supports multiple inheritance only through interfaces.
		3. java not supporting multiple inheritance through classes.
		4. one class cant extend more than one super class.
*/