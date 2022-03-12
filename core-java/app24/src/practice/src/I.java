class I 
{
	static int i = test1();
	static int j = test2();
	public static void main(String[] args) 
	{
		System.out.println("i : " + i + " and j : " + j);
	}
	static int test2()
	{
		System.out.println("I am from test - 2 :"+ i + ", " + j);
		return 400;
	}
	static int test1()
	{
		System.out.println("I am from test - 1 : "+ i + ", " + j);
		return 450;
	}
}
