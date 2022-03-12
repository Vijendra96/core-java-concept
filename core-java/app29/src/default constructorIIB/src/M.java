class M
{
	static int i = 10;
	public static void main(String[] args)
	{
		System.out.println(i);
		System.out.println(M.i);
		M m1 = new M();
		System.out.println(m1.i); //
		System.out.println(M.i);
	}
}
/*
10
10
10
10
*/