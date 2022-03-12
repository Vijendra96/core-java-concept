
class Z13 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Thread t1 = test();
		System.out.println("main end : ");
	}
	static Thread test()
	{
		System.out.println("I am from test");
		return new Thread();
	}
}

/*

main begin
I am from test
main end :

*/