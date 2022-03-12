class V 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		//int i = 1, m = 2, n = 3, p, q = 4;
		for(int i = 1, System.out.println("initialization with " + i); 
		test(i); 
		System.out.println("before change " + i), i++, System.out.println("after change " + i))            
		{
		System.out.println("Hello : " + i);
		}
		System.out.println("main end : ");
	}
	static boolean test(int i)
	{
		boolean b1 = (i <= 4);
		System.out.println("from test: boolean value for " + i + ":" + b1);
		return b1;
	}
}
