class O2 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		abc:
		do
		{
			System.out.println("do-while loop body begin i = " + i);
			int j = 1;
			while(j <= 3)
			{
				System.out.println("while loop body begin j = " + j);
				if(j==2)
				{
					System.out.println("inner if body : " + j);
					continue;
				}
				System.out.println("while loop body end j = " + j);
				j++;
			}
			System.out.println("do-while loop body end i = " + i);
			i++;
			System.out.println("--------------------------------------------");
		}
		while (i <= 5);
		System.out.println("main end : " + i);
	}
}
