class F 
{
	static int test()
	{
		return j;
	}
	static int i = test();
	static int j = 10;
	public static void main(String[] args) 
	{
		System.out.println(i + ", " + j);
	}
}
