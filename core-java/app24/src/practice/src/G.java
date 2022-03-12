class G 
{
	static int i = test();
	static int j = test();
	public static void main(String[] args) 
	{
		System.out.println("i : " + i + " and j " + j);
	}
	static int test()
	{
		return 450;
	}
}
