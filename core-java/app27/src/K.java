class K 
{
	int a;

	static void test1(K arg)
	{
		System.out.println("test-1 : " + arg.a);
		arg.a = 5;
	}
	static void test2(K arg)
	{
		System.out.println("test-2 brgin : " + arg.a);
		arg.a = 90;
		test1(arg);
		System.out.println("test-2 end : " + arg.a);
		arg.a = 10;
	}
	public static void main(String[] args) 
	{
		K ref = new K();
		ref.a = 2;
		System.out.println("main- 1 : " + ref.a); //2
		test1(ref);
		System.out.println("main-2 : " + ref.a);
		ref.a = 40;
		System.out.println("main-3 : " + ref.a);
		test2(ref);
		System.out.println("main-4 : " + ref.a);
	}
}

/*

main- 1 : 2
test-1 : 2
main-2 : 5
main-3 : 40
test-2 brgin : 40
test-1 : 90
test-2 end : 5
main-4 : 10

*/
/*
min- 1 : 2
test-1 : 2
min-2 : 5
min-3 : 40
test-2 : 40
min-4 : 10
*/