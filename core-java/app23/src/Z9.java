class Z9 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		short d1 = test();
		System.out.println("main end : " + d1);
	}
	static short test()
	{
		System.out.println("from test");
		return 500;
	}
}

/*


main begin
from test
main end : 500


*/