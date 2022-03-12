class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		do
		{
			System.out.println("body : " + i);

			int j = 2;
			do
			{
				System.out.println("inner do-while body : " + j);
				j++;
			}
			while (j <= 5);
			
			i++;
		}
		while (i >= 5);
		System.out.println("main end");
	}
}

