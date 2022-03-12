class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10);
		System.out.println("main end : " + i);
	}
	static void test(int i)
	{
		System.out.println("I am from test : " + i);
	}
}

/*

F.java:7: error: cannot find symbol
                System.out.println("main end : " + i);
                                                   ^
  symbol:   variable i
  location: class F
1 error


*/