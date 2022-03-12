package practicePackage;
class A
{
	private A()
	{
		System.out.println("A()");
	}
}
class F
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		A a1 = new A();
		System.out.println("main end");
	}
}

/*
	private member of one class cant be used in another class
*/




/*

practicePackage\F.java:14: error: A() has private access in A
                A a1 = new A();
                       ^
1 error

*/