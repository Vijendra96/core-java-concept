class A 
{
	A()
	{
		System.out.println("A()");
	}

	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("----------------");
		A a2 = new A();
		System.out.println("----------------");
		A a3 = new A();
		System.out.println("----------------");
		A a4 = new A();
		System.out.println("----------------");
	}
}
/*
A()
----------------
A()
----------------
A()
----------------
A()
----------------
*/