class H7 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		xyz:
		while(i <= 5)
		{
			System.out.println("body begin " + i);
			abc:
			for(int j = 101; j <= 103; j++)
			{
				System.out.println("inner begin :  " + i + ", " + j);
				if(j == 102)
				{
				System.out.println("if block");
				i++;
				break xyz;
				}
			System.out.println("inner end :  " + i + ", " + j);
			}
			System.out.println("body end " + i);
			i++;
		}
		System.out.println("main end ");
	}
}

