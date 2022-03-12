class F 
{
	static int i;
	static void test1()
	{
		System.out.println("from test1:"+ i);
		i = 25;
	}
	static void test2()
	{
		System.out.println("from test2:"+ i);
		i = 35;
	}
	public static void main(String[] args)
	{
		System.out.println("main1:" + i);
		i = 45;
		System.out.println("main2:" + i);
		test1();
		System.out.println("main3:" + i);
		i = 55;
		System.out.println("main4:" + i);
		test2();
		System.out.println("main5:" + i);
	}
}


/*
main1:0
main2:45
from test1:45
main3:25
main4:55
from test2:55
main5:35
*/