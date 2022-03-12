class J
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println(H.x);
		I.test();
		System.out.println("main end");
	}
}

/*

main begin
100
from test()
main end

*/