class A
{
	A()
	{
		System.out.println("A()");
	}
	{
		System.out.println("IIB");
	}
}
class U
{
	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println("--------");
		A a2 = new A();
	}
}

/*

IIB
A()
--------
IIB
A()

*/
