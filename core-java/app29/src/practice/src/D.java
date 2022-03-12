class D
{
	int i;
	D()
	{
		System.out.println("D() begin : "+ i);
		test();
		System.out.println("D() end: "+ i);
	}
	void test()
	{
		System.out.println("test begin : "+ i);
		i += 10;
		System.out.println("test end: "+ i);
	}
	public static void main(String[] args)
	{
		D ref = new D();
		System.out.println("main1:" + ref.i);
		ref.i += 20;
		System.out.println("main2:" + ref.i);
		ref.test();
		System.out.println("main3:" + ref.i);
	}
}
/*
D() begin : 0
test begin : 0
test end: 10
D() end: 10
main1:10
main2:30
test begin : 30
test end: 40
main3:40
*/ 