class L
{
	L()
	{
		System.out.println("L()");
	}
	L(int i)
	{
		System.out.println("L(int)");
	}
	L(double i)
	{
		System.out.println("L(double)");
	}
	L(int i, double j)
	{
		System.out.println("L(int, double)");
	}
	L(double i, int j)
	{
		System.out.println("L(double, int)");
	}
	public static void main(String[] args)
	{
	System.out.println("main begin");
	L r1 = new L();
	System.out.println("-------");
	L r2 = new L();
	System.out.println("-------");
	L r3 = new L(10);
	System.out.println("-------");
	L r4 = new L(10);
	System.out.println("-------");
	L r5 = new L(10);
	System.out.println("-------");
	L r6 = new L(1.9);
	System.out.println("-------");
	L r7 = new L(10, 4.5);
	System.out.println("-------");
	L r8 = new L(1, 50.7);
	System.out.println("-------");
	L r9 = new L(12, 5.5);
	System.out.println("-------");
	System.out.println("main end");
	}
}
/*
main begin
L()
-------
L()
-------
L(int)
-------
L(int)
-------
L(int)
-------
L(double)
-------
L(int, double)
-------
L(int, double)
-------
L(int, double)
-------
main end
*/