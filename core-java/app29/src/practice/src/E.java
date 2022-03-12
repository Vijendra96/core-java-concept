class E
{
	int i = 1;
	E()
	{
		System.out.println("E() begin:" + i);
		i += 2;
		test1();
		System.out.println("E() end:" + i);
	}
	void test1()
	{
		System.out.println("test1 begin:" + i);
		i += 3;
		test2();
		System.out.println("test1 end:" + i);
	}
	void test2()
	{
		System.out.println("test2 begin:" + i);
		i += 4;
		System.out.println("test2 end:" + i);
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		E ref = new E();
		System.out.println("main1: " + ref.i);
		ref.test1();
		System.out.println("main2: " + ref.i);
		ref.test2();
		System.out.println("main3: " + ref.i);
		System.out.println("main end");
	}
}
/*
main begin
E() begin:1
test1 begin:3
test2 begin:6
test2 end:10
test1 end:10
E() end:10
main1: 10
test1 begin:10
test2 begin:13
test2 end:17
test1 end:17
main2: 17
test2 begin:17
test2 end:21
main3: 21
main end
*/