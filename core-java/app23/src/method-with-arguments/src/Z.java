class Z 
{
	public static void main(String[] args) 
	{
		test(1);
	}
	static void test(int i)
	{
		System.out.print(i + ", ");
		if(i == 10)
		{	
			return;
		}
			i++;
		    test(i);
	}
}
