class M 
{
	static int i = test();
	static int test()
	{
		return 200;
	}
	public static void main(String[] args) 
	{
		System.out.println(M.i);
		M.i = 500;
		System.out.println(M.i);
	}
}
