class F
{
	F()
	{
		System.out.println("F()");
	}
	{
		System.out.println("IIB");
	}
	F(int i)
	{
		this();
		System.out.println("F(int)");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		F f1 = new F();
		System.out.println("----------");
		F f2 = new F(20);
		System.out.println("----------");
		System.out.println("main end");
	}
}
/*
main begin
IIB
F()
----------
IIB
F()
F(int)
----------
main end
*/