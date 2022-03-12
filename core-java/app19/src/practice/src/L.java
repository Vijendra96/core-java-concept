class L 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(char c = 'a'; c <= 'z'; c++)
		{
			System.out.println("loop body: " + c + " with ACSII code: " +(int)c);
		}
		System.out.println("main end");
	}
}
