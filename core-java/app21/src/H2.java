class H2 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while(i <= 5)
		{
		System.out.println("body begin " + i);
		for(int j = 101; j <= 103; j++)
		{
			System.out.println("inner :  " + i + ", " + j);
		}
		System.out.println("body end " + i);
		i++;
		}
		System.out.println("main end ");
	}
}

