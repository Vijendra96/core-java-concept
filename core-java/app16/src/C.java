class C 
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
			if(true)
			{
				System.out.println("=== if-2 body ===");
			}
			
		}
		System.out.println("=== main end ===");
	}
}
