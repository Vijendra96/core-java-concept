class E
{
	E()
	{
		System.out.println("E()");
	}
	E(int i)
	{
		System.out.println("E(int)");
	}
	E(int i, int j)
	{
		System.out.println("E(int, int)");
	}
	{
		System.out.println("IIB1");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		E e1 = new E(90);
		System.out.println("----------");
		E e2 = new E(90, 45);
		System.out.println("----------");
		E e3 = new E();
		System.out.println("----------");
		System.out.println("main end");
	}
	{
		System.out.println("IIB2");
	}
}
/*
main begin
IIB1
IIB2
E(int)
----------
IIB1
IIB2
E(int, int)
----------
IIB1
IIB2
E()
----------
main end
*/