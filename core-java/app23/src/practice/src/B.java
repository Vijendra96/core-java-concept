class B 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(450);
		System.out.println("main end : ");
	}
	public static void test(int i)
	{
		System.out.println("I am from test : " + i);
	}
}
