class I 
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
				System.out.println("end if body with : " + i +", " + j);
			}
			System.out.println("outer loop end");
			i++;
		}
		while (i<=5);
		System.out.println("main end");
	}
}
