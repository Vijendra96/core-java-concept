class R
{
	public static void main(String[] xyz)
	{
		System.out.println("R-main begin");
		Q.main(null);
		System.out.println("--------------");
		Q.main(xyz);
		System.out.println("R-main end");
	}

	static
	{
		System.out.println("R-SIB");
	}
}

/*
R-SIB
R-main begin
-SIB
Q-main
--------------
Q-main
R-main end
*/