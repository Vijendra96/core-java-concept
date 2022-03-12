class N 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		do
		{
			for(int j = 1; j <= 3; j++)
			{
				System.out.println("for body begin with: " + i + ", " + j);
				System.out.println("for body end: " + i + ", " + j);
			}
			System.out.println("do-while body : " + i);
			i++;
		}
		while (i <= 5);
		System.out.println("main end : " + i);
	}
}
