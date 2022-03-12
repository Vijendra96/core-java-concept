class Y 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(4);
		System.out.println("main end : " );
	}
		static void test(int i)
		{
			System.out.println("test begin : " + i);
			if(i == 1)
		{	
			return;
		}
			i--;
		    test(i);
		System.out.println("test end : " + i );

	}
}
