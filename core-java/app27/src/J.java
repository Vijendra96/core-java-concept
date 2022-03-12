class J 
{
	int a;

	static void test1(J arg)
	{
		System.out.println("test-1 : " + arg.a);
		arg.a = 5;
	}
	static void test2(J arg)
	{
		System.out.println("test-2 : " + arg.a);
		arg.a = 10;
	}
	public static void main(String[] args) 
	{
		J ref = new J();
		ref.a = 2;
		System.out.println("min- 1 : " + ref.a); //2
		test1(ref);
		System.out.println("min-2 : " + ref.a);
		ref.a = 40;
		System.out.println("min-3 : " + ref.a);
		test2(ref);
		System.out.println("min-4 : " + ref.a);
	}
}

/*
min- 1 : 2
test-1 : 2
min-2 : 5
min-3 : 40
test-2 : 40
min-4 : 10
*/