class H 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		do
		{
			System.out.println("body : " + i);
			do
			{
				System.out.println("inner do-while body : " + i);
				i--;
			}
			while (i == 2);
			
			i++;
		}
		while (i >= 2);
		System.out.println("main end");
	}
}

