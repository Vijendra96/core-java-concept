class Z 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++ + i++ + i++ + i + i-- + i + ++i + i + --i + i + i-- + i-- + i;
		//      0     1     2     3   3     2     3   3     2   2   2     1     0

		System.out.println(i);		//0
		System.out.println(j);		//24
	}
}
