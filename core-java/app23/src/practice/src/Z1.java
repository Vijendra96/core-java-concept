class Z1 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 520;
		i = test(i);
		System.out.println("main end : " + i);
	}
	public static int test(int x)
	{
		System.out.println("I am from test");
		x = 450;
		return x;
	}
}
