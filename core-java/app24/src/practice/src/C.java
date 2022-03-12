class C
{
	static int i = 5;
	public static void main(String[] args)
	{
		System.out.println(i); //5
		System.out.println(i++); // 5
		System.out.println(i++ + i); // (6 + 7) ==> 13
		System.out.println(++i + i++); // (8 + 8) ==> 16
		System.out.println(i); //9
	}
}

/*
5
5
13
16
9
*/