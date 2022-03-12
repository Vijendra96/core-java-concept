class S 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = test1(i++) + i++ + i + test1(++i) + i++ + i +
			//         0      1     2         3      3    4
				test2(i++) + i++ + i + test2(++i) + i++ + i +
			//		  4       5    6          7      7    8
				test2(--i) + i++ + i + test2(i--) + i++ + i +
			//		  7      7     8          8      7    8
				test1(--i) + i++ + i + test1(i--) + i-- + i;
			//	      7       7    8          8     7     6
		System.out.println("main : " + i + ", " + j);
	}
	static int test1(int i)
	{
		return i++  +  i;
	}
	static int test2(int i)
	{
		return i--  +  i;
	}
}


/*

main : 6, 182

*/