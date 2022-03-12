class X
{
	int i;
	static void test(X x1, X x2)
	{
		System.out.println("test:" + x1.i + ", " +  x2.i);
		int i = x1.i; // 10
		x1.i = x2.i; // 20
		x2.i = i; // 10
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		X ref1 = new X();
		ref1.i = 10;
		X ref2 = new X();
		ref2.i = 20;
		System.out.println("main1:" + ref1.i + ", " + ref2.i);
		test(ref1, ref2);
		System.out.println("main2:" + ref1.i + ", " + ref2.i);
		ref1.i += 30 + ref2.i; //60
		ref2.i += 40 + ref1.i; // 110
		test(ref2, ref1);
		System.out.println("main3:" + ref1.i + ", " + ref2.i);
		System.out.println("main end");
	}
}
/*
main begin
main1:10, 20
test:10, 20
main2:20, 10
test:110, 60
main3:110, 60
main end
*/