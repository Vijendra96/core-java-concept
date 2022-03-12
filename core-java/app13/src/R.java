class R 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			System.out.println("if - 1 begin");
			if(true && true)
			{
				System.out.println("if - 3");
			}
			System.out.println("if - 1 end");
		}
		System.out.println("main end");
	}
}
