class F 
{
	static int i = test();
	static
	{
		System.out.println("from SIB");
	}
	static int test()
	{
		System.out.println("from test : " + i);
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("main : " + i);
	}
}

/*
from test : 0
from SIB
main : 10
*/