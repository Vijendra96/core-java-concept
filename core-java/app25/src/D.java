class D 
{
	static int i = test1();
	static 
	{
		System.out.println("SIB==1");
	}
	static int j = test1();
	static 
	{
		System.out.println("SIB==2");
	}
	static int test1()
	{
		System.out.println("test---1");
		return 0;
	}


	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}


/*
test---1
SIB==1
test---1
SIB==2
main

*/