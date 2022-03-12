class Z8 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		double d1 = test();
		System.out.println("main end : " + d1);
	}
	static double test()
	{
		System.out.println("from test");
		return 2.5;
	}
}

/*

main begin
from test
main end : 2.5

*/