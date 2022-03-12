class Z10 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		byte d1 = test();
		System.out.println("main end : " + d1);
	}
	static byte test()
	{
		System.out.println("from test");
		return 50;
	}
}

/*

main begin
from test
main end : 50

*/