class B 
{
	public static void main(String[] args) 
	{
		System.out.println("=== main begin ===");
		if(false)
		{
			System.out.println("=== if-1 body ===");
		}
		else
		{
			System.out.println("=== else begin ===");
			if(true)
			{
				System.out.println("=== if-2 body ===");
			}
			System.out.println("=== else-1 end ===");
		}
		System.out.println("=== main end ===");
	}
}
