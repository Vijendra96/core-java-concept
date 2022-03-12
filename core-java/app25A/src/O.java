class O
{
	public static void main(String[] args)
	{
		System.out.println("O-main begin");
		A.main(null);
		System.out.println("--------------");
		A.main(args);
		System.out.println("O-main end");
	}
	static
	{
		System.out.println("O-SIB");
	}
}

class A
{
	public static void main(String[] args)
	{
		System.out.println("A-main");
	}
	static
	{
		System.out.println("static A-main");
	}
}

/*
O-SIB
O-main begin
static A-main
A-main
--------------
A-main
O-main end
*/