class J
{
	int i;
	void test1()
	{
		System.out.println("from test1:" + i);
		i = 25;
	}
	void test2()
	{
		System.out.println("from test2:" + i);
		i = 35; // this.i = 35;
		test1(); // this.test1();
	}
	public static void main(String[] args)
	{
		J ref = new J();
		ref.i = 20;
		System.out.println("main1:" + ref.i);
		ref.test1();
		System.out.println("main2:" + ref.i);
		ref.i = 45;
		ref.test2();
		System.out.println("main3:" + ref.i);
	}
}
/*
main1:20
from test1:20
main2:25
from test2:45
from test1:35
main3:25
*/