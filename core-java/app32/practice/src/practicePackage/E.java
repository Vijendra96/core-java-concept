class B
{
	private void test()
	{
		System.out.println(" from test()");
	}
}
class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B b = new B();
		b.test();
		System.out.println("main end");
	}
}

/*

practicePackage\E.java:14: error: test() has private access in B
                b.test();
                 ^
1 error

*/