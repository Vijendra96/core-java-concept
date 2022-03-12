class V 
{
	public static void main(String[] args)
	{
		int i = 10;
		int j = test1(i);
		System.out.println(i + ", " + j);
	}
	public static int test1(int i)
	{
		return test2(i++) + i;
		//return test2(10) + 11;
		//return 58 + 11;
	}
	public static int test2(int i)
	{
		return i++ + test3(i++) + i;
		//return 10 + test3(11) + 12;
		//return 10 + 36 + 12;
	}
	public static int test3(int i)
	{
		return i++ + i++ + i;
		//return 11 + 12 + 13;
	}
}


/*

10, 69

*/