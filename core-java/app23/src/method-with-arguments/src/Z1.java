class Z1 
{
	public static void main(String[] args) 
	{
		test(20);
	}
	 public static void test(int i)
	{
		System.out.print(i + ", ");
		if(i == 1)
		{
			return;
		}
		i--;
		test(i);
	}
}
