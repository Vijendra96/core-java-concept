class S 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			if(false)
			{
				if(true)
				{
					System.out.println("if3");
				}
			}
		}
		System.out.println("main end");
	}
}

/*
output :
main begin
main end
*/