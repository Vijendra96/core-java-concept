class K 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = ++i + ++i + --i + --i  + i++ + i;
		//	  2     3     2     1    1     2

		System.out.println(i);  //2
		System.out.println(j);  //11

	}
}
