class N
{
	public static void main(String[] args)
	{
		System.out.println("N-main");
	}
	static
	{
		System.out.println("N-SIB");
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
		System.out.println("A-main");
	}
}

/*
Output:
N-SIB
N-main
*/
