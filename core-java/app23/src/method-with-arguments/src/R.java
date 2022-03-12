class R
{
	public static void main(String[] args)
	{
		int i = 1;
	    int j = test1(i++ + i++ + i);
		//int j = test1(1 + 2 + 3); // i = 3, j = 6
		int k = test2(++i + i++ + i);
		//int k = test2(4 + 4 + 5); , i = 5, k = 14
		int m = test3(i-- + i + i++);
		//int m = test3(5 + 4 + 4); i = 5, m= 28
		System.out.println(i + ", " + j + ", " + k + ", " + m);
	}
	public static int test1(int i)
	{
		return i++;
	}
	public static int test2(int i)
	{
		return ++i;
	}
	public static int test3(int i)
	{
		return i++ + ++i;
		//return 13 + 15;
	}
}


/*
		5, 6, 14, 28
*/