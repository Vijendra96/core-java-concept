class J 
{
	static int i = test1();
	static int j = test2();
	public static void main(String[] args) 
	{
		System.out.println("I am from main, i : " + i + " and j : " + j);
	}
	static int test2()
	{
		System.out.println("I am from test - 2 :"+ i + ", " + j);
		i += i + j + 1;
		j += i + j + 2;
		return i + j + 3;
	}
	static int test1()
	{
		System.out.println("I am from test - 1 : "+ i + ", " + j);
		i += i + j + 4;
		j += i + j + 5;
		return i + j + 6;
	}
}
