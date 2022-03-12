class E 
{
	static int i = 3;
	static
	{
		int j = i + test();
		//int j = 3 + 18;
		//int j = 8 + 18; (wrong)
		i += j;
		System.out.println("sib:" + j);
	}
		static int test()
	{
		i = i + 5;		//8
		return i + 10;
	}

	public static void main(String[] args) 
	{
		System.out.println("main:" + i);
	}
}

/*
sib:21
main:29
*/