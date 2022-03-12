class M 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = ++i + i++ - --i + i++ + i++ - ++i - i;
		     //  2     2      2   2     3       5   5

		System.out.println(i + ", " + j);  // 5, -3

	}
}
