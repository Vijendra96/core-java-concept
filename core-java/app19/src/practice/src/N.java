class N 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 10, j = 20; j > 10; i ++, j--)
		{
			System.out.println("loop body: "+ " i = " + i + " and "+" j = " + j);
		}
		System.out.println("main end");
	}
}
