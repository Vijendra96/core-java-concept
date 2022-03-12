package practicePackage;
class B 
{
	private void test()
	{
		System.out.println("I am from test()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B b1 = new B();
		b1.test();
		System.out.println("main end");
	}
}


/*
main begin
I am from test()
main end
*/