class F 
{
	int i;
	void test1()
	{
		System.out.println("from test1:" + this.i);
		this.i = 25;
	}
	void test2()
	{
		System.out.println("from test2:" + this.i);
		this.i = 35;
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.i = 20;
		System.out.println("main1:" + f1.i);
		f1.test1();
		System.out.println("main2:" + f1.i);
		f1.i = 45;
		f1.test2();
		System.out.println("main3:" + f1.i);
	}
}
/*
main1:20
from test1:20
main2:25
from test2:45
main3:35
*/