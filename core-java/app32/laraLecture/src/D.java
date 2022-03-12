class C 
{
	private void test()
	{
		System.out.println("I am from test()");
	}
}
class D
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.test();
		System.out.println("done");
	}
}

/*
D.java:13: error: test() has private access in C
                c1.test();
                  ^
1 error
*/