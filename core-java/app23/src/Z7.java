class Z7 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		char a = test();
		System.out.println("main end : " + a);
	}
	static char test()
	{
		System.out.println("from test");
		return 'd';
	}
}

/*


main begin
from test
main end : d

*/