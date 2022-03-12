class J 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("outer loop body begin with " + i);
			for(int j = 100; j <= 105; j++)
			{
				System.out.println("inner loop body begin with " + i + ", " + j);
				if( j== 103)
				{
					break;
				}
				System.out.println("inner loop body end with " + i + ", " + j);
			}
			System.out.println("outer loop body begin with " + i);
			
			
		}
		System.out.println("main end");
	}
}
