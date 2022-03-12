class W
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int i = 1;
		for(i = 2; i <= 4; i++);
		{
		System.out.println("body stmt-1: " + i);
		System.out.println("body stmt-2");
		System.out.println("body stmt-3");
		}
		System.out.println("main end");
	}
}