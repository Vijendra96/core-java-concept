class M 
{
	public static void test(boolean args1, String args2)
	{
		System.out.println("I am from test, boolean args is = " + args1 + " and  string args is = " + args2);
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(false, "heello" , 45);
		System.out.println("main end ");
	}
}
