class K 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		do
		{
			System.out.println("outer loop begin");
			for(int j = 1; j <= 3; j++)
			{
				System.out.println("start if body with : " + i +", " + j);
				int k = 2;
				while(k <= 5)
				{
					System.out.println("inner loop begin with : i = " + i + " and j = " + j + " and k = " + k); 
					System.out.println("inner loop ended with : i = " + i + " and j = " + j + " and k = " + k); 
					k++;
				}
				System.out.println("end if body with : " + i +", " + j);
			}
			System.out.println("outer loop end");
			i++;
		}
		while (i<=5);
		System.out.println("main end");
	}
}
