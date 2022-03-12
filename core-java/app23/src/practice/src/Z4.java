class Z4 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 520;
		int j = test(i);
		System.out.println("main end : " + i + ", " + j);
	}
	public static int test(int i)
	{
		System.out.println("I am from test");
		i = 450;
		return i;
	}
}
