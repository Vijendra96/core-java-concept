interface A
{
	void test1();
	void test2();
	void test3();
}
class N implements A
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public void test2()
	{
		System.out.println("from test2");
	}
	public void test3()
	{
		System.out.println("from test3");
	}
	public static void main(String[] args)
	{
		N obj = new N();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("done");
	}
}
/*
		Output:
		from test1
		from test2
		from test3
		done
*/