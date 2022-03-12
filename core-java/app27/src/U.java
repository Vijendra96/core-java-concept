class U
{
	int i;
	static void test()
	{
		U u1 = new U();
		System.out.println("test:"+ u1.i);
		u1.i = 10;
		System.out.println("test:"+ u1.i);
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
/*
main begin
test:0
test:10
main end
*/