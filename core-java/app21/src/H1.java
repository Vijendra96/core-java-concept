class H1 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while(i <= 5)
		{
		System.out.println("body begin " + i);
		int j = 101;
		while(j <= 103)
		{
			System.out.println("inner :  " + i + ", " + j);
			j++;
		}
		System.out.println("body end " + i);
		i++;
		}
		System.out.println("main end ");
	}
}

