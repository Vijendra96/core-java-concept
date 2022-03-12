class P
{
	public static void main(String[] xyz)
	{
		System.out.println("P-main begin");
		A.main(null);
		System.out.println("--------------");
		A.main(xyz);
		System.out.println("P-main end");
	}
		static
		{
			System.out.println("P-SIB");
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
		System.out.println("A-main SIB");
	}
}
