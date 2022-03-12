class I  
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1000; i >= 5; i /= 3)            // i = i / 3
		{
		System.out.println("Hello : " + i);
		}
		System.out.println("main end");
	}
}