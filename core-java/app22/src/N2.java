class N2 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		do
		{
			System.out.println("do-while body : " + i);
			for(int j = 1; j <= 3; j++)
			{
				System.out.println("for body begin with: " + i + ", " + j);
				
				if(j == 2)
				{
					break;
				}
				System.out.println("for body end: " + i + ", " + j);
			}	
			i++;
		}
		while (i <= 5);
		System.out.println("main end : " + i);
	}
}
