class A 
{
	public static void main(String[] args) 
	{
		System.out.println("=== main begin ===");
		if(true)
		{
			System.out.println("=== if-1 body ===");
			if(true)
			{
				System.out.println("=== if-2 body ===");
			}
			else
			{
				System.out.println("=== else-2 body ===");
			}
			System.out.println("=== if-1 end ===");
		}
		else
		{
			System.out.println("=== else-1 body ===");
		}

		System.out.println("=== main end ===");
	}
}
