class N
{
	N()
	{
		System.out.println("N()");
	}
	N(int i)
	{
		this();
		System.out.println("N(int)");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		N ref1 = new N();
		System.out.println("-------");
		N ref2 = new N(20);
		System.out.println("-------");
		System.out.println("main end");
	}
}
/*
main begin
N()
-------------
N()
N(int)
------------
main end
*/