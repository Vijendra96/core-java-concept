class T 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = test1(i++) + i++ + i + test2(++i) + i++ + i + 
			//        1      2     3          4     4     5
				test3(i++) + i++ + i + test4(i++) + i++ + i +
			//         5      6    7          7      8    9
				test1(++i) + i++ + i + test2(i++) + ++i + i +			
			//         10     10   11         11     13   13
				test3(++i) + i++ + i + test4(++i) + ++i + i;
			//         14    14    15         16     17   17
		System.out.println(i + ", " + j);
	}
	static int test1(int i)
	{
		return i++;
	}
	public static int test2(int i)
	{
	return ++i;
	}
	public static int test3(int i)
	{
	return i--;
	}
	public static int test4(int i)
	{
	return --i;
	}
}

/*

	17, 222

*/