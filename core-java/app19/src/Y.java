class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1, j = 20; i <= 3 && j > 5; i++, j-=3)
		{
			System.out.println("body with " + i + " , " + j);
		}
		System.out.println("main end");
	}
}
