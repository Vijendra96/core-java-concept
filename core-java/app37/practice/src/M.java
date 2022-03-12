interface A
{
	void test1();
}
class M implements A
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public static void main(String[] args)
	{
		M m1 = new M();
		m1.test1();
		System.out.println("done");
	}
}

/*
		interface methods are public by default. we should implement with a public keyword in the sub class.
*/
