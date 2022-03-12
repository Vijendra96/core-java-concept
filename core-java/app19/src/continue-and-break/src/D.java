class D 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("body with begin with " + i);
			if(i >= 4)
			{
				continue;
				System.out.println("if block " + i);
			}
			System.out.println("body end with " + i);
		}
		System.out.println("main end");
	}
}


/*
continue should be the last statement in the current block.
*/