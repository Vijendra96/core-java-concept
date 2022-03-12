class G 
{
	public static void test(int i, String s1)
	{
		System.out.println("I am from test i = " + i + " and  s1 = " + s1);
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(420, "abc");
		System.out.println("main end : ");
	}
}
